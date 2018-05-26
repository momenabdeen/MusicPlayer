package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("currentWord","MainActivity-----------------------------------");

        // Find the View that shows the Arabic Songs category
        TextView arabic = (TextView) findViewById(R.id.Arabic);

        // Set a click listener on that View
        arabic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Arabic Songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent arabicIntent = new Intent(MainActivity.this, Arabic_Songs.class);
                startActivity(arabicIntent);
            }
        });


        // Find the View that shows the Arabic Songs category
        TextView english = (TextView) findViewById(R.id.Arabic);

        // Set a click listener on that View
        english.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Arabic Songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent englishIntent = new Intent(MainActivity.this, English_Songs.class);
                startActivity(englishIntent);
            }
        });


    }
}
