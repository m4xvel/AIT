package com.example.ait;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavBar extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_nav_bar);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, homeFragment).commit();
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.action_home) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, homeFragment).commit();
                return true;
            } else if (item.getItemId() == R.id.action_settings) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, settingsFragment).commit();
                return true;
            }
            return false;
        });
    }
}