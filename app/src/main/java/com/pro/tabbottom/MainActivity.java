package com.pro.tabbottom;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);

        tV = (TextView)findViewById(R.id.tv);

        BottomNavigationView bottom_nav = (BottomNavigationView)findViewById(R.id.bottom_nav_bar);
        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.refresh:tV.setText("Refresh");
                        return true;
                    case R.id.favorite:tV.setText("Favorite");
                        return true;
                    case R.id.profile:tV.setText("Profile");
                        return true;
                }
                return false;
            }
        });
    }

}
