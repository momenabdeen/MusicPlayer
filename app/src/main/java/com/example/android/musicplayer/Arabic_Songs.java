package com.example.android.musicplayer;

import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class Arabic_Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic__songs);


        // Create a list of words
        //we update the ArrayList to be the arraylist of word instead of arraylist of String
        // new Word ("one,lutti) means to make a new object from the word calss and store it in the Words list
        final ArrayList<Arabic_Custom_Class> songs = new ArrayList<>();
        songs.add(new Arabic_Custom_Class("Amr Diab","Tamaly Maak"));
        songs.add(new Arabic_Custom_Class("Amr Diab","Khleek Fakrny"));
        songs.add(new Arabic_Custom_Class("Amr Diab","sneen"));
        songs.add(new Arabic_Custom_Class("Amr Diab","Khalik Maaya"));
        songs.add(new Arabic_Custom_Class("Amr Diab","Ragea"));
        songs.add(new Arabic_Custom_Class("Amr Diab","Meaddy Elnas"));
        Log.v("songs",songs.get(5).getmSongName()+"----------------------------------------------------------------------------");


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArabicAdapter Adapter = new ArabicAdapter(this, songs) ;




        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(Adapter);


    }
}
