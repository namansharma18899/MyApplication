package com.example.myapplication;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.myapplication.R.id.toolbar;

public class MainActivity extends AppCompatActivity
{

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   Button buta=(Button) findViewById(R.id.buta);
       // final EditText tv=(EditText) findViewById(R.id.tv);
        Toolbar toolbar = (findViewById(R.id.toolbar));
        setSupportActionBar(toolbar);  // We do this to make our toolbar the default acion bar

         /*      buta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=tv.getText().toString();
                Intent intero=new Intent(getApplicationContext(),mapart.class);
                intero.putExtra("Extras",s);
                startActivity(intero);
                //war
            }
        }); */
    }
}
