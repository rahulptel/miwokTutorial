package com.example.android.miwok;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by rahul on 27/12/16.
 */

public class Word {

    /* Store the default translation of the word*/
    private String mDefaultTranslation;

    /* Store the Miwok translation of the word*/
    private String mMiwokTranslation;

    /* Store the resource id of the image */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /* Store the resource id of the audio*/
    private int mAudioResourceId;

    /* Flag for image being present or absent*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /* A public constructor for the class with two text*/
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /* A public constructor for the class with two text and one integer*/
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /* Get the default translation of the word*/
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /* Get the miwok translation of the word*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /* Get the resource id of the given image */
    public int getmImageResourceId() { return mImageResourceId; }

    /* Get whether the image is present or not */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /* Get the audio resource id*/
    public int getAudioResourceId(){ return mAudioResourceId; }
}
