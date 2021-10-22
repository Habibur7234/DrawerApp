package com.example.drawerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        drawerLayout= findViewById(R.id.drawerId);
        NavigationView navigationView = findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.Nav_open,R.string.Nav_close);

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item))
        {
            return true;

        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


    if (item.getItemId() == R.id.homeMenuId) {
        
        Intent intent = new Intent(this, HomeActivity.class);

        startActivity(intent);

    }

        return false;
    }
}