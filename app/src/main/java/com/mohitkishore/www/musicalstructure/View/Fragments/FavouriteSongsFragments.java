package com.mohitkishore.www.musicalstructure.View.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mohitkishore.www.musicalstructure.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavouriteSongsFragments extends Fragment {


    public FavouriteSongsFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourite_songs_fragments, container, false);
    }

}
