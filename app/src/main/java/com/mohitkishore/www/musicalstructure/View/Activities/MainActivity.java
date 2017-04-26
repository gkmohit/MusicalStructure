package com.mohitkishore.www.musicalstructure.View.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mohitkishore.www.musicalstructure.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mArtistsButton;
    private Button mNowPlayingButton;
    private Button mFavouritesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setListeners();
    }

    private void initViews() {
        mArtistsButton = (Button) findViewById(R.id.artistsButton);
        mNowPlayingButton = (Button) findViewById(R.id.nowPlayingButton);
        mFavouritesButton = (Button) findViewById(R.id.favouritesButton);
    }

    private void setListeners() {
        mArtistsButton.setOnClickListener(this);
        mNowPlayingButton.setOnClickListener(this);
        mFavouritesButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.artistsButton: {
                artistsButtonClick();
                break;
            }
            case R.id.nowPlayingButton: {
                nowPlayingButtonClick();
                break;
            }
            case R.id.favouritesButton: {
                favouritesButtonClick();
                break;
            }
        }
    }

    private void artistsButtonClick() {
        startActivityHelper(ArtistsActivity.class);
    }

    private void nowPlayingButtonClick() {
        startActivityHelper(NowPlayingActivity.class);
    }

    private void favouritesButtonClick() {
        startActivityHelper(FavouriteSongsActivity.class);
    }

    private void startActivityHelper(Class<?> cls) {
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
    }

}
