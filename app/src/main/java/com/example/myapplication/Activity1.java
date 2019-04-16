package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        TextView tv2=(TextView) findViewById(R.id.tv2);
        TextView tv=(TextView) findViewById(R.id.tv);
      /* if(getIntent().hasExtra("Extras")) {
                //  String g=(getIntent().getExtras().getString("com.example.myapplication.Extras"));
                Intent iin= getIntent();
                Bundle b = iin.getExtras();
                if(b!=null)
                {
                    //String s[] =(String[]) b.getStringArray("Extras");
                    String st= (String) b.getString("Extras");
                    // double d = (double) b.getDouble("Extras");
                    tv2.setText(st);
                }
        } */
    }
}
