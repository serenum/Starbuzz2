package com.serenum.android.starbuzz;

/**
 * Created by Serenum on 06.04.2017.
 */

public class Drink {

    public static String DRINK_NO = "drinkno";
    private String name;
    private String description;
    private int imageResourceID;

    public Drink(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public static Drink[] drinks = {
            new Drink("Capuccino", "Best cappuccino ever!", R.drawable.cappuccino),
            new Drink("Latte", "Best latte ever!", R.drawable.latte),
            new Drink("Espresso", "Best espresso ever!", R.drawable.filter)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
