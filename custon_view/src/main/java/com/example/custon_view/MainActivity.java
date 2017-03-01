package com.example.custon_view;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //com.example.custon_view.OurView.OurView
        OurView view = new OurView(this);

       // setContentView(R.layout.activity_main);

        setContentView(view);

    }
}