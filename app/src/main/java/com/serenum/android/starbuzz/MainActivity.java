package com.serenum.android.starbuzz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView grocery_list = (ListView) findViewById(R.id.grocery_list);
        grocery_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view,
                                    int position,
                                    long l) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
