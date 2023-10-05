package com.example.labwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        EditText editTextNumber = findViewById(R.id.editTextNumber);
        EditText editTextNumber3 = findViewById(R.id.editTextNumber3);

        editTextNumber3.setFocusable(false);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float sumNumPl = Float.parseFloat(editTextNumber.getText().toString()) + Float.parseFloat(editTextNumber3.getText().toString());
                String str_sum = "" + sumNumPl;
                editTextNumber3.setText(str_sum);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float sumNumRed = Float.parseFloat(editTextNumber.getText().toString()) - Float.parseFloat(editTextNumber3.getText().toString());
                String str_sum = "-" + sumNumRed;
                editTextNumber3.setText(str_sum);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
                    myIntent.putExtra("key", editTextNumber3.getText().toString());
                    MainActivity.this.startActivity(myIntent);
            }
        });
    }
    @Override
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
    // daasdasdsad
}
