package com.example.two_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        findViewById(R.id.btnAndroid).setOnClickListener(this::onAndroid);
        findViewById(R.id.btnApple).setOnClickListener(this::onApple);
    }

    private void onApple(View view){

        Class<Next_Activity> cls = Next_Activity.class;

        Bundle bundle = new Bundle();
        bundle.putString("One","iOS-5");
        bundle.putString("Two","iOS-6");

        Intent intent = new Intent(this,cls);
        intent.putExtras(bundle);

        startActivity(intent);

    }

    public void onAndroid(View view){

         Class<Next_Activity> cls = Next_Activity.class;

        Bundle bundle = new Bundle();
        bundle.putString("One","Marshmallow");
        bundle.putString("Two","Nougat");

        Intent intent = new Intent(this, cls);
        intent.putExtras(bundle);

        startActivity(intent);
    }
}
