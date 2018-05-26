package com.example.android.musicplayer;

/**
 * Created by momenabdeen100 on 4/2/2018.
 */

public class Arabic_Custom_Class {


    // all of them are private because we need all of them to be accesed inside this class

    // default translation for the word
    private String mSingerName ;


    // miwok translation for the word
    private String  mSongName ;

    

    // this is the constructor with 2 inputs uses for the phresas Activity that shows 2 Strings
    // thter is no return type from the constructor
    public  Arabic_Custom_Class (String singerName ,String  songName ) {


        mSingerName = singerName;
        mSongName = songName;

    }

    public String getmSingerName() {
        return mSingerName;
    }


    public String getmSongName() {
        return mSongName;
    }

}
