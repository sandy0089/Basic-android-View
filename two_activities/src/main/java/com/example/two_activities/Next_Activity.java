package com.example.two_activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class Next_Activity extends AppCompatActivity {


    public static final String TAG = Next_Activity.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_);


        final RelativeLayout rl=(RelativeLayout) findViewById(R.id.activity_next_);

        final RadioButton radio_red =(RadioButton) findViewById(R.id.rad1);
        final RadioButton radio_green =(RadioButton) findViewById(R.id.rad2);
        final RadioButton radio_blue =(RadioButton) findViewById(R.id.rad3);


        radio_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rl.setBackgroundColor(Color.RED);
            }
        });

        radio_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rl.setBackgroundColor(Color.GREEN);
            }
        });

        radio_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rl.setBackgroundColor(Color.BLUE);
            }
        });

        findViewById(R.id.btnBack).setOnClickListener(this::onBack);


        Intent intentResponsible = getIntent();


        Bundle bundle = intentResponsible.getExtras();

        if(bundle !=null){

            String one = bundle.getString("One");
            String two = bundle.getString("Two");
            String three = bundle.getString("Three");

          //  Log.i(TAG,"One -"+one+ "Two -"+two+ "Three -"+three);

            ((RadioButton)findViewById(R.id.rad1)).setText(one);
            ((RadioButton)findViewById(R.id.rad2)).setText(two);
            ((RadioButton)findViewById(R.id.rad3)).setText(three);
        }



    }

    private void onBack(View view){


/*        int checked = ((RadioGroup)findViewById(R.id.radGrp)).getCheckedRadioButtonId();

        Bundle bundle = new Bundle();
        bundle.putString("res", ((RadioButton)findViewById(checked)).getText().toString());

                Intent intentBack = new Intent();
                intentBack.putExtras(bundle);
                setResult(RESULT_OK, intentBack);
*/

        finish();
    }
}
