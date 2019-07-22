package com.example.george.androidfragments;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    int number = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Adding the toolbar.

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //setting the up navigation functionality of the application.

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void  ImageButtonClicked(View view){

        CharSequence text = "The button is clicked "+number+" times";
        int duration = Toast.LENGTH_SHORT;

        Toast toast =  Toast.makeText(this,text,duration);
        toast.show();
        number++;
    }
}
