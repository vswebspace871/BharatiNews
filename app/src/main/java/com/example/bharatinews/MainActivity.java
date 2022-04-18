package com.example.bharatinews;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    //constraint layout ki jagah drawer layout use krna hai
    //toolbar ya appbar banaen ke liye layout folder me xml file banegi
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "New toast Added", Toast.LENGTH_SHORT).show();
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);

        // apne custom toolbar ko setup krne ke liye code
        setSupportActionBar(toolbar);

        // apne custom toolbar ko setup krne ke liye code

        // is code se sare icon black ki jagah color me aane lagenge
        navigationView.setItemIconTintList(null);
        // is code se sare icon black ki jagah color me aane lagenge

        // Toggle button, three horizontal line lagane ke liye code
        // ye 5 arguement leta hai
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        toggle.getDrawerArrowDrawable().setColor(getColor(R.color.white));

        // Toggle button, three horizontal line lagane ke liye code
    }
}