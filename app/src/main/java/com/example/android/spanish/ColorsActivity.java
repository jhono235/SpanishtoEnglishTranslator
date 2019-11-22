package com.example.android.spanish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList <Word> words = new ArrayList<Word>();

        words.add(new Word("red", "rojo"));
        words.add(new Word("green", "verde"));
        words.add(new Word("brown", "marron"));
        words.add(new Word("gray", "gris"));
        words.add(new Word("black", "negro"));
        words.add(new Word("white", "blanco"));
        words.add(new Word("yellow", "amarillo"));




        WordAdapter adapter = new WordAdapter(this, words);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);


    }
}



