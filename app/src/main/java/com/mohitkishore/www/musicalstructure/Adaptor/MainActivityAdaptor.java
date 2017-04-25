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
        if (position == 1) {
            return new NowPlayingFragment();
        } else if (position == 1) {
            return new ArtistsFragment();
        } else {
            return new FavouriteSongsFragments();
        }
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 1) {
            return mContext.getString(R.string.now_playing);
        }
        if (position == 2) {
            return mContext.getString(R.string.artists);
        } else {
            return mContext.getString(R.string.favourites);
        }
    }
}
