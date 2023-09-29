package com.example.sharedpre;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity {
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        SharedPreferences sp;
        sp=getSharedPreferences("SD",Context.MODE_PRIVATE);
        e1.setText(sp.getString("un","").toString());
        e2.setText(sp.getString("up","").toString());
    }

}