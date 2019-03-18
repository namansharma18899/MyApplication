package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        TextView tv2=(TextView) findViewById(R.id.tv2);
        TextView tv=(TextView) findViewById(R.id.tv);
        if(getIntent().hasExtra("Extras")) {
          //  String g=(getIntent().getExtras().getString("com.example.myapplication.Extras"));
            Intent iin= getIntent();
            Bundle b = iin.getExtras();
            if(b!=null)
            {
                String j =(String) b.get("Extras");
                tv2.setText(j);
            }
        }
    }
}
