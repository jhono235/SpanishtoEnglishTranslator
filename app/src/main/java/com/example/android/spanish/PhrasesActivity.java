package com.example.android.spanish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList <Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "¿A dónde vas?"));
        words.add(new Word("What is your name?", "¿Cuál es su nombre?"));
        words.add(new Word("My name is...", "Me llamo"));
        words.add(new Word("How are you feeling?", "¿Como te sientes?"));
        words.add(new Word("I’m feeling good.", "Me siento bien."));
        words.add(new Word("Are you coming?", "¿Vienes?"));
        words.add(new Word("Yes, I’m coming.", "Si, voy para allá."));
        words.add(new Word("Let’s go.", "Vamonos."));
        words.add(new Word("Come here.", "Ven aca."));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);


    }
}
