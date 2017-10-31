package com.example.android.miwok;

/**
 * Created by hhan on 19/10/17.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private int mImageResourceId;

    /**
     * Create a new Word object constructor
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Create a new Word object constructor
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param iwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String iwokTranslation, int imageResourceId) {

        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = iwokTranslation;
        this.mImageResourceId = imageResourceId;

    }

    /**
     *  Get the default translation of the word
     *
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     *  Get the Miwok translation of the word
     *
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public Integer getImageResourceId(){
        return mImageResourceId;
    }
}
