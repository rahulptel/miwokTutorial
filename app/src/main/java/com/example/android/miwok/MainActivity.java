/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the text-views of various category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        TextView family = (TextView)findViewById(R.id.family);
        TextView colors = (TextView)findViewById(R.id.colors);
        TextView phrases = (TextView)findViewById(R.id.phrases);

        //Set the onClickListen on the numbers view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new intent
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                //Start new activity
                startActivity(numbersIntent);
            }
        });

        //Set the OnClickListener on the family view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new Intent
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                //Start new activity
                startActivity(familyIntent);
            }
        });


        //Set the OnClickListener on the colors view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new Intent
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //Start new activity
                startActivity(colorsIntent);
            }
        });

        //Set the OnClickListener on the phrases view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new Intent
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                //Start new activity
                startActivity(phrasesIntent);
            }
        });

    }

}
