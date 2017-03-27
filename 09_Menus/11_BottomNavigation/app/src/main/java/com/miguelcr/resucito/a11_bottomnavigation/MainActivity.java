package com.miguelcr.resucito.a11_bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment f = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                // f = new HomeFragment();
                mTextMessage.setText(R.string.title_home);
                return true;
            case R.id.navigation_dashboard:
                // f = new DashboardFragment();
                mTextMessage.setText(R.string.title_dashboard);
                return true;
            case R.id.navigation_notifications:
                // f = new NotificacionesFragment();
                mTextMessage.setText(R.string.title_notifications);
                return true;
        }

            /*
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content,f)
                    .commit();

                    */

        return false;
    }
}
