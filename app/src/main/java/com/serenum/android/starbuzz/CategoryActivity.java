package com.serenum.android.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Serenum on 06.04.2017.
 */

public class CategoryActivity extends ListActivity {

    @Override
    public void onCreate(Bundle saveOnInstanceState) {
        super.onCreate(saveOnInstanceState);
        ListView category_list = getListView();
        ArrayAdapter<Drink> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks
        );
        category_list.setAdapter(adapter);

        category_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(CategoryActivity.this, DrinkActivity.class);
                intent.putExtra(Drink.DRINK_NO, (int) id);
                startActivity(intent);
            }
        });
    }
}
