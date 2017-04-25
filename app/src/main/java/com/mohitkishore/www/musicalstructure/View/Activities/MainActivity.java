package com.mohitkishore.www.musicalstructure.View.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.mohitkishore.www.musicalstructure.Adaptor.MainActivityAdaptor;
import com.mohitkishore.www.musicalstructure.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
            // Activity was brought to front and not created,
            // Thus finishing this will get us to the last viewed activity
            finish();
            return;
        }
        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        MainActivityAdaptor mainPageAdaptor = new MainActivityAdaptor(MainActivity.this, getSupportFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(mainPageAdaptor);

        //Find the tab layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        //Set the tab layout with view pager
        tabLayout.setupWithViewPager(viewPager);
    }
}
