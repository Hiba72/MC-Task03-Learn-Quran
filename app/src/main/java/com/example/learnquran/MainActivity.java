package com.example.learnquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Intent intent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtName=findViewById(R.id.textView2);
        TextView txtRoll=findViewById(R.id.textView4);
        txtName.setText("Hiba Saqib");
        txtRoll.setText("BCSF18A540");
        Button btn=findViewById(R.id.button);
        Button btn1=findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web= Uri.parse("https://github.com/Hiba72/MC-Task03-Learn-Quran");
                intent=new Intent(Intent.ACTION_VIEW,web);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              intent1=new Intent(MainActivity.this,MainActivity2.class);
              startActivity(intent1);
            }
        });

    }
}