package com.example.bharatinews.Adapters;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bharatinews.Models.SettingsModel;
import com.example.bharatinews.R;
import com.example.bharatinews.Utils.SharedPreferencesManager;

import java.util.ArrayList;

public class SettingsAdapter extends RecyclerView.Adapter {
    ArrayList<SettingsModel> list;
    Context context;

    public SettingsAdapter(ArrayList<SettingsModel> list, Context context) {

        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;
        switch (viewType) {
            case 0:
                Log.d("abhinav", "onCreateViewHolder: 0");
                view = inflater.inflate(R.layout.settings_sample_layout2, parent, false);
                return new NormalViewHolder(view);
            case 1:
                Log.d("abhinav", "onCreateViewHolder: 1");
                view = inflater.inflate(R.layout.settings_sample_layout1, parent, false);
                return new SwitchViewHolder(view);

        }
       // view = inflater.inflate(R.layout.settings_sample_layout2, parent, false);
        return null;
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SettingsModel model = list.get(position);
        if (model != null) {
            switch (model.getType()) {
                case 0:
                    Log.d("abhinav", "onBindViewHolder: 0");
                    NormalViewHolder mHolder = (NormalViewHolder) holder;
                    mHolder.setView(model);
                    break;
                case 1:
                    Log.d("abhinav", "onBindViewHolder: 1");
                    SwitchViewHolder sHolder = (SwitchViewHolder) holder;
                    sHolder.setView(model);
                    break;
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NormalViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView version;

        public NormalViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView3);
            textView = itemView.findViewById(R.id.textView2);
            version = itemView.findViewById(R.id.textViewversion);
        }

        public void setView(SettingsModel model) {
            imageView.setImageResource(model.getIcon());
            textView.setText(model.getText());
            if (TextUtils.isEmpty(model.getVersion())){
                version.setVisibility(View.GONE);
            } else {
                version.setVisibility(View.VISIBLE);
                version.setText(model.getVersion());
            }

        }
    }

    public class SwitchViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        SwitchCompat switchbtn;

        public SwitchViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView3);
            textView = itemView.findViewById(R.id.textView2);
            switchbtn = itemView.findViewById(R.id.switch1);
        }

        public void setView(SettingsModel model) {
            imageView.setImageResource(model.getIcon());
            textView.setText(model.getText());
            switchbtn.setChecked(model.getSwitchState());
            Log.d("abhinav", "setView: "+model.getSwitchState() );
            switchbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    Log.d("abhinav", "onCheckedChanged: "+b);
                    new SharedPreferencesManager(context).setNightMode(b);
                }
            });
        }
    }
}
