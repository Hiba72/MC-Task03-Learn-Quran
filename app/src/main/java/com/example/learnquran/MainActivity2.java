package com.example.learnquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    int rand,a,b;
    Character c='\u0627';
    Character c1='\u0649';
    Character letter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Random random = new Random();
        TextView txt = findViewById(R.id.textView5);
        Button btnGenerate= findViewById(R.id.button4);
        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Character.valueOf(c);
                b=Character.valueOf(c1);
                rand=random.nextInt(23)+a;
                letter=(char) rand;
                txt.setText(String.valueOf(letter));
            }
        });
    }
}