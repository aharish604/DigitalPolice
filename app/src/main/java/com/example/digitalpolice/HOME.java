package com.example.digitalpolice;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

public class HOME extends AppCompatActivity {


    private ActionBar toolbar;


    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                    new Home_Framgment()).commit();

        /*Home_Framgment home_framgment = new Home_Framgment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction_home = manager.beginTransaction();
        transaction_home.add(R.id.frame_container, home_framgment);
        transaction_home.commit();*/
        }
    }

    public void ChangeActionbar(String title)
    {
        getSupportActionBar().setTitle(title);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment = new Home_Framgment();
                    break;
                case R.id.navigation_profile:
                    selectedFragment = new Profile();
                    break;
                case R.id.navigation_settings:
                    selectedFragment = new Settings();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                    selectedFragment).commit();

            return true;
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                Toast.makeText(this, "Share APP", Toast.LENGTH_SHORT).show();


                break;
            case R.id.About:
                //Toast.makeText(this, "About App", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, About.class);

                startActivity(intent);

                break;

            case R.id.logout:
                //Toast.makeText(this, "About App", Toast.LENGTH_SHORT).show();
                Intent logout = new Intent(this, LoginActivity.class);
                startActivity(logout);

                break;

        }
        return super.onOptionsItemSelected(item);
    }

    public void MakeComplaint(View view) {
        Intent intent = new Intent(this, RegisterComplaint.class);
        startActivity(intent);
    }

    public void StatusCheck(View view) {
        Intent intent = new Intent(this, StatusCheck.class);
        startActivity(intent);

    }

    public void AnonymousReport(View view) {
        Intent intent = new Intent(this, AnonymousReport.class);
        startActivity(intent);

    }

    public void Notification(View view) {

        Intent intent = new Intent(this, Notifications.class);
        startActivity(intent);

    }

    public void NearbyStations(View view) {
        Intent intent = new Intent(this, NearbyStation.class);
        startActivity(intent);
    }

    public void Help(View view) {

        Intent intent = new Intent(this, Help.class);

        startActivity(intent);
    }

    public void RateApp(View view) {

        Intent intent = new Intent(this, Rateus.class);

        startActivity(intent);
    }
}
