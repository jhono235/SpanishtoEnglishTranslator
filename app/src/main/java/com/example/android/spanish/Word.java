package com.example.android.spanish;

/*Represents a vocab word that the user wants to learn, contains default and
Spanish translations
 */


public class Word {
    private String mDefaultTranslation;

    private String mSpanishTranslation;

    public Word(String defaultTranslation, String spanishTranslation)
    {
        mSpanishTranslation = spanishTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    //Get the default translation of the word
    public String getDefaultTranslation ()
    {
        return mDefaultTranslation;
    }

    //Get Spanish translation of the word
    public String getSpanishTranslation()
    {
        return mSpanishTranslation;
    }
}
