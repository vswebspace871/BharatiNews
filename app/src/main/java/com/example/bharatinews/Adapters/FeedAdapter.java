package com.example.bharatinews.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.bharatinews.Models.FeedModel;
import com.example.bharatinews.R;

import static com.example.bharatinews.Models.FeedModel.LAYOUT_ONE;
import static com.example.bharatinews.Models.FeedModel.LAYOUT_TWO;
import static com.example.bharatinews.Models.FeedModel.LAYOUT_THREE;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter {

    ArrayList<FeedModel> list;
    Context context;

    public FeedAdapter(ArrayList<FeedModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        switch (list.get(position).getViewType()){
            case 1:
                return LAYOUT_ONE;
            case 2:
                return LAYOUT_TWO;
            case 3:
                return LAYOUT_THREE;
            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType){
            case LAYOUT_ONE:
                View LayoutOne = LayoutInflater.from(context).inflate(R.layout.feed_layout_one, parent,false);
                return new ViewholderOne(LayoutOne);

            case LAYOUT_TWO:
                View LayoutTwo = LayoutInflater.from(context).inflate(R.layout.feed_layout_two, parent,false);
                return new ViewholderTwo(LayoutTwo);

            case LAYOUT_THREE:
                View LayoutThree = LayoutInflater.from(context).inflate(R.layout.feed_layout_three, parent,false);
                return new ViewholderThree(LayoutThree);

            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (list.get(position).getViewType()){
            case LAYOUT_ONE:
                String sm = list.get(position).getMessage();
                ((ViewholderOne) holder).setView(sm);
                break;
            case LAYOUT_TWO:
                String rm = list.get(position).getMessage();
                int pic = list.get(position).getImage();
                ((ViewholderTwo) holder).setView(rm, pic);
                break;
            case LAYOUT_THREE:
                String iv_sender = list.get(position).getMessage();
                ((ViewholderThree) holder).setView(iv_sender);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewholderOne extends RecyclerView.ViewHolder {
        private final TextView textView_one;

        public ViewholderOne(@NonNull View itemView) {
            super(itemView);
            textView_one =itemView.findViewById(R.id.textView6);
        }
        private void setView(String text){
            textView_one.setText(text);
        }
    }


    class ViewholderTwo extends RecyclerView.ViewHolder {
        private final TextView textView_two;
        private final ImageView imageView_one;

        public ViewholderTwo(@NonNull View itemView) {
            super(itemView);
            textView_two =itemView.findViewById(R.id.textView7);
            imageView_one = itemView.findViewById(R.id.imageView4);
        }
        private void setView(String text, int pic){
            textView_two.setText(text);
            imageView_one.setImageResource(pic);
        }
    }


    class ViewholderThree extends RecyclerView.ViewHolder {
        private final TextView textView_three;

        public ViewholderThree(@NonNull View itemView) {
            super(itemView);
            textView_three =itemView.findViewById(R.id.textView8);
        }
        private void setView(String text){
            textView_three.setText(text);
        }
    }
}
