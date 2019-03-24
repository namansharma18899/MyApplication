package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buta=(Button) findViewById(R.id.buta);
        final EditText tv=(EditText) findViewById(R.id.tv);
        buta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=tv.getText().toString();
                Intent intero=new Intent(getApplicationContext(),Activity1.class);
                intero.putExtra("Extras",s);
                startActivity(intero);
                //war
            }
        });
    }
}
