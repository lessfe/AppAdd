package com.example.labwork1;

import static com.example.labwork1.R.id.editTextNumber3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity2 extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        setContentView(R.layout.activity_main2);
        EditText editTextNumber = findViewById(R.id.editTextNumber);
        /*String stringT = "" + editTextNumber3;*/
        editTextNumber.setText(value);


    }
}