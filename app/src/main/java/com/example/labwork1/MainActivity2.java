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
import android.widget.TextView;


public class MainActivity2 extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        EditText editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber.setFocusable(false);

        editTextNumber.setText(value);
    }
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(savedInstanceState.getString("myText"));

    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        TextView textView2 = findViewById(R.id.textView2);
        super.onSaveInstanceState(outState);
        outState.putString("myText", textView2.getText().toString());

    }
}