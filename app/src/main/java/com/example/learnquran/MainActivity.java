package com.example.learnquran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtName=findViewById(R.id.textView2);
        TextView txtRoll=findViewById(R.id.textView4);
        txtName.setText("Hiba Saqib");
        txtRoll.setText("BCSF18A540");


    }
}