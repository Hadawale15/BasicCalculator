package com.example.basic_calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowResult extends AppCompatActivity {
     TextView obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        obj=findViewById(R.id.new_value);
        Intent intent=getIntent();

        String n=intent.getStringExtra(MainActivity.First_Key);
        obj.setText(n);
    }
}