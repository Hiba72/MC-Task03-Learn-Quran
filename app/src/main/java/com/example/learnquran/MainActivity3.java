package com.example.learnquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    Intent intent;
    int rand,a,b,score=0,total=0;
    Character c='\u0627';
    Character c1='\u0649';
    Character letter='\0';
    String score1;
    String total1;
    boolean isAns=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Random random = new Random();
        TextView txt = findViewById(R.id.textView9);
        TextView txt1=findViewById(R.id.textView10);
        TextView txt2=findViewById(R.id.textView11);
        Button btnGenerate= findViewById(R.id.button12);
        Button btnHalqiyah =findViewById(R.id.button13);
        Button btnLahatiyah =findViewById(R.id.button14);
        Button btnShajariyah=findViewById(R.id.button15);
        Button btnTarfiyah=findViewById(R.id.button16);
        Button btnNiteeyah=findViewById(R.id.button17);
        Button btnLisaveyah=findViewById(R.id.button18);
        Button btnGhunna=findViewById(R.id.button19);


        Button btnFinish=findViewById(R.id.button20);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isAns=false;
                a=Character.valueOf(c);
                b=Character.valueOf(c1);
                rand=random.nextInt(35)+a;
                letter=(char) rand;
                if(letter=='\u063B' || letter=='\u0629'|| letter=='\u063C'|| letter=='\u063D' ||letter=='\u063E' || letter=='\u063F' || letter=='\u0640'){
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
                if(letter=='\0'){
                    txt1.setText("Please generate any Arabic letter");
                    txt1.setTextColor(Color.BLACK);
                    txt1.setPadding(10,50,10,10);
                    txt2.setText("");
                }
                else if (letter=='\u0627' || letter=='\u0647' || letter=='\u0639' || letter=='\u062D' || letter=='\u063A' || letter=='\u062E')
                {
                    if(isAns==false) {
                        txt1.setText("True");
                        score+=5;
                        total+=5;
                        isAns=true;
                    }

                }
                else{
                    if(isAns==false) {
                        txt2.setText("False");
                        total += 5;
                        isAns=true;

                    }
                }
            }
        });
        btnLahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\0'){
                    txt1.setText("Please generate any Arabic letter");
                    txt1.setTextColor(Color.BLACK);
                    txt1.setPadding(10,50,10,10);
                    txt2.setText("");

                }
               else if(letter=='\u0642' || letter=='\u0643')
                {
                    if(isAns==false) {
                        txt1.setText("True");
                        score += 5;
                        total += 5;
                        isAns=true;
                    }
                }
                else{
                    if(isAns==false) {
                        txt2.setText("False");
                        total += 5;
                        isAns=true;

                    }
                }
            }
        });
        btnShajariyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\0'){
                    txt1.setText("Please generate any Arabic letter");
                    txt1.setTextColor(Color.BLACK);
                    txt1.setPadding(10,50,10,10);
                    txt2.setText("");

                }
               else if(letter=='\u062C' ||letter=='\u0634' || letter=='\u064A' || letter=='\u0636'|| letter=='\u0649'){
                    if(isAns==false) {
                        txt1.setText("True");
                        score += 5;
                        total += 5;
                        isAns=true;
                    }
                }
                else{
                    if(isAns==false) {
                        txt2.setText("False");
                        total += 5;
                        isAns=true;

                    }
                }
            }
        });
        btnTarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\0'){
                    txt1.setText("Please generate any Arabic letter");
                    txt1.setTextColor(Color.BLACK);
                    txt1.setPadding(10,50,10,10);
                    txt2.setText("");

                }
                else if(letter=='\u0644' ||letter=='\u0646' || letter=='\u0631' ){
                    if(isAns==false) {
                        txt1.setText("True");
                        score += 5;
                        total += 5;
                        isAns = true;
                    }
                }
                else{
                    if(isAns==false) {
                        txt2.setText("False");
                        total += 5;
                        isAns=true;

                    }
                }
            }
        });
        btnNiteeyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\0'){
                    txt1.setText("Please generate any Arabic letter");
                    txt1.setTextColor(Color.BLACK);
                    txt1.setPadding(10,50,10,10);
                    txt2.setText("");

                }
                else if(letter=='\u062A' ||letter=='\u062F' || letter=='\u0637' ){
                    if(isAns==false) {
                        txt1.setText("True");
                        score += 5;
                        total += 5;
                        isAns=true;
                    }
                }
                else{
                    if(isAns==false) {
                        txt2.setText("False");
                        total += 5;
                        isAns=true;

                    }
                }
            }
        });
        btnLisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\0'){
                    txt1.setText("Please generate any Arabic letter");
                    txt1.setTextColor(Color.BLACK);
                    txt1.setPadding(10,50,10,10);
                    txt2.setText("");

                }
                else if(letter=='\u0638' ||letter=='\u0630' || letter=='\u062B' || letter=='\u0633' ||letter=='\u0632' || letter=='\u0635' ){
                    if(isAns==false) {
                        txt1.setText("True");
                        score += 5;
                        total += 5;
                        isAns=true;
                    }
                }
                else{
                    if(isAns==false) {
                        txt2.setText("False");
                        total += 5;
                        isAns=true;

                    }
                }
            }
        });

        btnGhunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter=='\0'){
                    txt1.setText("Please generate any Arabic letter");
                    txt1.setTextColor(Color.BLACK);
                    txt1.setPadding(10,50,10,10);
                    txt2.setText("");

                }
                else if(letter=='\u0645' ||letter=='\u0646' || letter=='\u0641' || letter=='\u0628' || letter=='\u0648' ){
                   if(isAns==false) {
                       txt1.setText("True");
                       score += 5;
                       total += 5;
                       isAns=true;
                   }
                }
                else{
                    if(isAns==false) {
                        txt2.setText("False");
                        total += 5;
                        isAns=true;

                    }
                }
            }
        });
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1=String.valueOf(score);
                total1=String.valueOf(total);
                intent=new Intent(MainActivity3.this,MainActivity4.class);
                intent.putExtra("scoree",score1);
                intent.putExtra("totall",total1);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onResume() {
        TextView txt3 = findViewById(R.id.textView9);
        TextView txt4=findViewById(R.id.textView10);
        TextView txt5=findViewById(R.id.textView11);
        super.onResume();
        score=0;
        total=0;
        score1="";
        total1="";
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");

    }
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("values",String.valueOf(letter));
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        String myStrings = savedInstanceState.getString("values");
        TextView txt1 = findViewById(R.id.textView9);
        txt1.setText(myStrings);

    }
}