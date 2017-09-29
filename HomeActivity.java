package com.example.lei.foodordering;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Lei on 9/27/2017.
 */

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final NavigationView navigation = (NavigationView) findViewById(R.id.navigation);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String> (HomeActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.FoodStyles));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(HomeActivity.this, spinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }
        });
    }
}
