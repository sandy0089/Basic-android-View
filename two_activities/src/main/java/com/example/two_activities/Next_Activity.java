package com.example.two_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;

public class Next_Activity extends AppCompatActivity {


    public static final String TAG = Next_Activity.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_);

        findViewById(R.id.btnBack).setOnClickListener(this::onBack);




        Intent intentResponsible = getIntent();


        Bundle bundle = intentResponsible.getExtras();
        if(bundle !=null){

            String one = bundle.getString("One");
            String two = bundle.getString("Two");

            Log.i(TAG,"One -"+one+ "Two -"+two);

            ((RadioButton)findViewById(R.id.rad1)).setText(one);
            ((RadioButton)findViewById(R.id.rad2)).setText(two);
        }
    }

    private void onBack(View view){

        finish();
    }
}
