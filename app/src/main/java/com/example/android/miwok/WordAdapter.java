package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static java.lang.Boolean.TRUE;

/**
 * Created by rahul on 27/12/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    /*
    * Constructor setting the internal storage for context and list i.e words
    * The second parameter is of no use as we are trying to populate data in
    * a custom view i.e. two text views and not the regular view i.e. a single text view.
    * Also at a later stage we would like to add an image in this view.
    * */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId)
    {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    /*
    * Provides a view for an AdapterView (ListView, GridView, etc)
    *
    * @param position The position in the list of the item that should be
    *               displayed in the list item view
    * @param convertView The recycled view to populate
    * @param parent The parent ViewGroup that is used for inflation
    * @return The View for the position in the AdapterView
    * */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the Word object located at this position in this list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID number_translated
        TextView numberTranslated = (TextView) listItemView.findViewById(R.id.number_translated);
        // Get the translated number from the current Word object and
        // set this text on the numberTranslated TextView
        numberTranslated.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID number_default
        TextView numberDefault = (TextView) listItemView.findViewById(R.id.number_default);
        // Get the default translation from the current Word object and
        // set this text on the numberDefault TextView
        numberDefault.setText(currentWord.getDefaultTranslation());

        //Find the ImageView in the list_item.xml layout with the ID list_item_image
        ImageView listImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);

        /* Check if the current word object has an image resource */
        if(currentWord.hasImage()) {
            // Get the image resource ID from the current Word object and
            // set the image on listItemImage
            listImageView.setImageResource(currentWord.getmImageResourceId());
            listImageView.setVisibility(View.VISIBLE);
        }
        else{
            listImageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;

        //return super.getView(position, convertView, parent);
    }

}
