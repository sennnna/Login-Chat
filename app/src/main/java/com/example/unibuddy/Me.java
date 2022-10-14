package com.example.unibuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Me extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.me);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.chat:
                        startActivity(new Intent(getApplicationContext(), Chat.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.finder:
                        startActivity(new Intent(getApplicationContext(), Finder.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.share:
                        startActivity(new Intent(getApplicationContext(), Share.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.me:
                        return true;
                }
                return false;
            }
        });
    }
}