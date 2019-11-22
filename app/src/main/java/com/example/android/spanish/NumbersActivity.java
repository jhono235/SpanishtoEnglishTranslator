package com.example.android.spanish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList <Word> words = new ArrayList<Word>();

        words.add(new Word("one", "uno"));
        words.add(new Word("two", "dos"));
        words.add(new Word("three", "tres"));
        words.add(new Word("four", "cuatro"));
        words.add(new Word("five", "cinco"));
        words.add(new Word("six", "seis"));
        words.add(new Word("seven", "siete"));
        words.add(new Word("eight", "ocho"));
        words.add(new Word("nine", "nueve"));
        words.add(new Word("ten", "diez"));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);


    }
}
