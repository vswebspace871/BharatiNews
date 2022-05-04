package com.example.bharatinews.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bharatinews.Adapters.FeedAdapter;
import com.example.bharatinews.Models.FeedModel;
import com.example.bharatinews.R;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FeedAdapter adapter;
    ArrayList<FeedModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        recyclerView = findViewById(R.id.recycler_view);
        list = new ArrayList<>();

        list.add(new FeedModel(FeedModel.LAYOUT_ONE,"विषय"));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "मुख्य खबरें", R.drawable.live));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "न्यूज़ वीडियों", R.drawable.ic_baseline_play_circle_filled_24));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "फिल्में-टीवी", R.drawable.ic_baseline_tv_24));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "नौकरी", R.drawable.yoga));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "अतुल्य भारतं", R.drawable.auto));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "खेल", R.drawable.cup));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "धर्म", R.drawable.om));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "दिलचस्पं", R.drawable.popcorn));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "राजनितिक कार्टून", R.drawable.live));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "पर्यटन", R.drawable.world));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "इतिहास", R.drawable.hourglass));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "गैजेटं", R.drawable.city));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "ऑटो", R.drawable.auto));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "स्वास्थय", R.drawable.heartbeat));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "कारोबार", R.drawable.gadgets));
        list.add(new FeedModel(FeedModel.LAYOUT_TWO, "फोटो गैलरी", R.drawable.gallery));
        list.add(new FeedModel(FeedModel.LAYOUT_ONE, "स्थान"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "उत्तर प्रदेश"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "दिल्ली एनसीआर"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "उत्तराखंड"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "हिमाचल प्रदेश"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "जम्मू और कश्मीर"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "गुजरात"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "पंजाब"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "हरियाणा "));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "राजस्थान"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "बिहार "));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "छत्तीसगढ़"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "झारखण्ड"));
        list.add(new FeedModel(FeedModel.LAYOUT_THREE, "मध्यप्रदेश"));

        adapter = new FeedAdapter(list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}