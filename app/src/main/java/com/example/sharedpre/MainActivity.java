package com.example.sharedpre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);

    }
    public void onPass(View v){
        SharedPreferences sp;
        sp=getSharedPreferences("SD", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("un",e1.getText().toString());
        ed.putString("up",e2.getText().toString());
        ed.commit();
        Intent i=new Intent("sec");
        startActivity(i);
    }
}