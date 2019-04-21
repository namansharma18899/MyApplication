package com.example.myapplication;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Objects;

import static com.example.myapplication.R.id.map;
import static com.example.myapplication.R.id.toolbar;

//import static com.example.myapplication.R.id.toolbar;

public class MainActivity extends AppCompatActivity {
     DrawerLayout draw;
    ActionBarDrawerToggle actionBarDrawerToggle;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_activity);
      Button buta = (Button) findViewById(R.id.buta);
        // Button butb= (Button) findViewById(R.id.lol);
        // final EditText tv=(EditText) findViewById(R.id.tv);
        Button bubble= (Button) findViewById(R.id.bubble);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        draw = findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, draw, toolbar, R.string.open,
                R.string.close);
        draw.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        // We do this to make our toolbar the default acion bar
       /*   butb.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                setContentView(R.layout.drawer_activity);
              }
          }); */
        buta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "naman";//tv.getText().toString();
                Intent intero = new Intent(getApplicationContext(), mapart.class);
                intero.putExtra("Extras", s);
                startActivity(intero);
                //why isn't this showing u
                //
                //
                // p
            }
        });
        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intero2 = new Intent(getApplicationContext(),mapart.class);
                intero2.putExtra("goto","goto");
                startActivity(intero2);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (draw.isDrawerOpen(GravityCompat.START)) {
            draw.closeDrawer(GravityCompat.START);
        } else super.onBackPressed();
    }
}
