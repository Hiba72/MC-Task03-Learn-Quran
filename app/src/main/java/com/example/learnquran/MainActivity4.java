package com.example.learnquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    Intent intent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView txt =findViewById(R.id.textView12);
        intent1=getIntent();
        txt.setText("You scored "+intent1.getStringExtra("scoree")+"/"+intent1.getStringExtra("totall"));


    }
}