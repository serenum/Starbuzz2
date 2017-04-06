package com.serenum.android.starbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Serenum on 06.04.2017.
 */

public class DrinkActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedOnInstanceState) {
        super.onCreate(savedOnInstanceState);
        setContentView(R.layout.drink_layout);

        int drinkno = (Integer)getIntent().getExtras().get(Drink.DRINK_NO);
        Drink drink = Drink.drinks[drinkno];

        ImageView drinkImage = (ImageView)findViewById(R.id.drink_image);
        drinkImage.setImageResource(drink.getImageResourceID());
        drinkImage.setContentDescription(drink.getName());

        TextView name = (TextView) findViewById(R.id.drink_name);
        name.setText(drink.getName());

        TextView description = (TextView) findViewById(R.id.drink_description);
        description.setText(drink.getDescription());
    }
}
