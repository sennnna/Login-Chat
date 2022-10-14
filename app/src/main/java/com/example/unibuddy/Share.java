package com.example.unibuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Share extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.share);

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
                        return true;
                    case R.id.me:
                        startActivity(new Intent(getApplicationContext(), Me.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}