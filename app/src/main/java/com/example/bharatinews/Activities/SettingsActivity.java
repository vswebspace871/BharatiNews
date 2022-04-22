package com.example.bharatinews.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.bharatinews.Adapters.SettingsAdapter;
import com.example.bharatinews.Interfaces.SettingsInterface;
import com.example.bharatinews.Models.SettingsModel;
import com.example.bharatinews.R;
import com.example.bharatinews.Utils.SharedPreferencesManager;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerview);
        ArrayList<SettingsModel> list = new ArrayList<>();


        // Setting Back arrow
        toolbar.setTitle(R.string.settings);
        //   Deprecated = toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_arrow_back_24));
        toolbar.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.ic_baseline_arrow_back_24));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // Setting Back arrow

        list.add(new SettingsModel(0, R.drawable.bell, "नोटिफिकेशन सेटिंग्स",""));
        list.add(new SettingsModel(1, R.drawable.moon, "नाईट मोड", new SharedPreferencesManager(this).getNightMode()));
        list.add(new SettingsModel(0, R.drawable.ic_baseline_local_offer_24, "फीड मैनेज करें",""));
        list.add(new SettingsModel(0, R.drawable.ic_baseline_bookmark_24, "बुकमार्क चेक करें",""));
        list.add(new SettingsModel(0, R.drawable.ic_baseline_star_24, "ऐप को रेटिंग दें",""));
        list.add(new SettingsModel(0, R.drawable.ic_baseline_share_24, "अपने दोस्तों को बताएं",""));
        list.add(new SettingsModel(0, R.drawable.chat, "अपने सुझाव दें",""));
        list.add(new SettingsModel(0, R.drawable.ic_baseline_mobile_friendly_24, "ऐप वर्ज़न","9.2"));
        list.add(new SettingsModel(0, R.drawable.shield, "प्राइवेसी पॉलिसी",""));





        SettingsAdapter adapter = new SettingsAdapter(list,this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

    }


//    @Override
//    public void setNightModeSwitch(boolean mode) {
//        new SharedPreferencesManager(this).setNightMode(mode);
//    }
}