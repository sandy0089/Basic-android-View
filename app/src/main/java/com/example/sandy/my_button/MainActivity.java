package com.example.sandy.my_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnDate= (Button) findViewById(R.id.btnDate);
       // btnDate.setOnClickListener(new View.OnClickListener() {
           /* @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txtDate);
                txt.setText(new Date().toString());

            }
        });*/

        btnDate.setOnClickListener(this::date);
    }

    private void date(View view){
        TextView txtDate= (TextView) findViewById(R.id.txtDate);
        txtDate.setText(new Date().toString());
    }


    private class Click implements View.OnClickListener {

        public void onClick(View v) {
            TextView txtDate = (TextView) findViewById(R.id.txtDate);
            txtDate.setText(new Date().toString());
        }
    }
}
