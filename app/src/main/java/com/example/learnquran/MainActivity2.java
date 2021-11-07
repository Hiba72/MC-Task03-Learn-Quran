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
        Button btnNiteeyah=findViewById(R.id.button8);
        Button btnLisaveyah=findViewById(R.id.button11);
        Button btnGhunna=findViewById(R.id.button10);
        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Character.valueOf(c);
                b=Character.valueOf(c1);
                rand=random.nextInt(35)+a;
                letter=(char) rand;
                if(letter=='\u063B' || letter=='\u063C'|| letter=='\u063D' ||letter=='\u063E' || letter=='\u063F' || letter=='\u0640'){
                    letter='\u0643';
                }
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
                if(letter=='\u062C' ||letter=='\u0634' || letter=='\u064A' || letter=='\u0636'|| letter=='\u0649'){
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
        btnNiteeyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\u062A' ||letter=='\u062F' || letter=='\u0637' ){
                    txt1.setText("True");
                }
                else{
                    txt2.setText("False");
                }
            }
        });
        btnLisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\u0638' ||letter=='\u0630' || letter=='\u062B' || letter=='\u0635' || letter=='\u0632' || letter=='\u0633' ){
                    txt1.setText("True");
                }
                else{
                    txt2.setText("False");
                }
            }
        });
        btnGhunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\u0645' ||letter=='\u0646' || letter=='\u0641' || letter=='\u0628' || letter=='\u0648' ){
                    txt1.setText("True");
                }
                else{
                    txt2.setText("False");
                }
            }
        });
    }
}