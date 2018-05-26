package com.example.android.musicplayer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by momenabdeen100 on 4/2/2018.
 */

public class ArabicAdapter extends ArrayAdapter<Arabic_Custom_Class> {


    public  ArabicAdapter(Context context, ArrayList<Arabic_Custom_Class> songs) {
        super(context, 0, songs);

        Log.v("currentWord","ArabicAdapte constructor ------------------------------------------"+songs.get(0).getmSongName());

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_view, parent, false);
        }


        // Get the {@link Word} object located at this position in the list
        Arabic_Custom_Class currentWord = getItem(position);
        Log.v("currentWord","currentWord------------------------------------------");
        // Find the TextView in the single_view.xml layout with the ID miwok_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.nameOfSinger);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        miwokTextView.setText(currentWord.getmSingerName());

        // Find the TextView in the single_view.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.nameOfSong);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord.getmSongName());


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
