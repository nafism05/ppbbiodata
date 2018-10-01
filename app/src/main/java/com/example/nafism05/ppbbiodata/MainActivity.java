package com.example.nafism05.ppbbiodata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myPhone = findViewById(R.id.button2);
        Linkify.addLinks(myPhone  , Linkify.PHONE_NUMBERS);


    }

    public void showAddress(View v){
        Intent i =new Intent(getApplicationContext(),Alamat.class);

        startActivity(i);
    }
}
