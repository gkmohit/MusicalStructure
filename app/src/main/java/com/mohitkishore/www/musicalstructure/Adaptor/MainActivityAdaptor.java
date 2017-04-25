package com.mohitkishore.www.musicalstructure.Adaptor;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mohitkishore.www.musicalstructure.R;
import com.mohitkishore.www.musicalstructure.View.Fragments.ArtistsFragment;
import com.mohitkishore.www.musicalstructure.View.Fragments.FavouriteSongsFragments;
import com.mohitkishore.www.musicalstructure.View.Fragments.NowPlayingFragment;

/**
 * Created by AirUnknown on 2017-04-25.
 */

public class MainActivityAdaptor extends FragmentPagerAdapter {

    Context mContext;

    public MainActivityAdaptor(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1: {
                return new NowPlayingFragment();
            }
            case 2: {
                return new ArtistsFragment();
            }
            case 3: {
                return new FavouriteSongsFragments();
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 1: {
                return mContext.getString(R.string.now_playing);
            }
            case 2: {
                return mContext.getString(R.string.artists);
            }
            case 3: {
                return mContext.getString(R.string.favourites);
            }
        }
        return null;
    }
}
