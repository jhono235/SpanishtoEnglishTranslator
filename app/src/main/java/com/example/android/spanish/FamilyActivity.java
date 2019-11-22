package com.example.android.spanish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList <Word> words = new ArrayList<Word>();

        words.add(new Word("father", "padre"));
        words.add(new Word("mother", "madre"));
        words.add(new Word("son", "hijo"));
        words.add(new Word("daughter", "hija"));
        words.add(new Word("brother", "hermano"));
        words.add(new Word("sister", "hermana"));
        words.add(new Word("grandmother", "abuela"));
        words.add(new Word("grandfather", "abuelo"));



        WordAdapter adapter = new WordAdapter(this, words);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);


    }
}