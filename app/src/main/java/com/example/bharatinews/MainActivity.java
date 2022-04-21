package com.example.bharatinews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

import com.example.bharatinews.Activities.BookmarkActivity;
import com.example.bharatinews.Activities.NotificationActivity;
import com.example.bharatinews.Activities.SettingsActivity;
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
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);
        // appbar me se AppName remove krne ke liye code
         toolbar.setTitle("");
        // app bar k icon ko oncreateoptionmenu method ke ander inflate karana hota hai jo oncreate ke bahar banta hai
        // appbar me se AppName remove krne ke liye code


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.notification){
            Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
            startActivity(intent);
        }else if (item.getItemId() == R.id.setting){
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
        }else if (item.getItemId() == R.id.starappbar){
            Intent intent = new Intent(MainActivity.this, BookmarkActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}