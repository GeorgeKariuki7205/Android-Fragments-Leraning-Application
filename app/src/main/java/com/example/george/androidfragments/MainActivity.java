package com.example.george.androidfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //The method that is used to launch the new activity.

    public  void launchDetails(View view){

        CharSequence text = "The launch button is clicked";
        int duration = Toast.LENGTH_SHORT;

        Toast toast =  Toast.makeText(this,text,duration);
        toast.show();

    }
}
