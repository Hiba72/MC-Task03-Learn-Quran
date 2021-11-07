package com.example.learnquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        TextView txt1=findViewById(R.id.textView6);
        TextView txt2=findViewById(R.id.textView7);
        Button btnGenerate= findViewById(R.id.button4);
        Button btnHalqiyah =findViewById(R.id.button5);
        Button btnLahatiyah =findViewById(R.id.button6);
        Button btnShajariyah=findViewById(R.id.button7);
        Button btnTarfiyah=findViewById(R.id.button9);
        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Character.valueOf(c);
                b=Character.valueOf(c1);
                rand=random.nextInt(23)+a;
                letter=(char) rand;
                txt.setText(String.valueOf(letter));
                txt1.setText("");
                txt2.setText("");
            }
        });
        btnHalqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (letter=='\u0627' || letter=='\u0647' || letter=='\u0639' || letter=='\u062D' || letter=='\u063A' || letter=='\u062E')
                {
                   txt1.setText("True");
                }
                else{
                    txt2.setText("False");
                }
            }
        });
        btnLahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(letter=='\u0642' || letter=='\u0643')
             {
                 txt1.setText("True");
             }
             else{
                 txt2.setText("False");
             }
            }
        });
        btnShajariyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\u062C' ||letter=='\u0634' || letter=='\u064A' || letter=='\u0636'){
                    txt1.setText("True");
                }
                else{
                    txt2.setText("False");
                }
            }
        });
        btnTarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\u0644' ||letter=='\u0646' || letter=='\u0631' ){
                    txt1.setText("True");
                }
                else{
                    txt2.setText("False");
                }
            }
        });
    }
}