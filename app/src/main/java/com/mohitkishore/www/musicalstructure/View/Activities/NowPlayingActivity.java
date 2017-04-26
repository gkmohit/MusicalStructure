package com.mohitkishore.www.musicalstructure.View.Activities;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.mohitkishore.www.musicalstructure.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NowPlayingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //I can use JcPlayer plugin for playing songs
    }

}
