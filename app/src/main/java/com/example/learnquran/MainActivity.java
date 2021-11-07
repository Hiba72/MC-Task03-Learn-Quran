package com.example.learnquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtName=findViewById(R.id.textView2);
        TextView txtRoll=findViewById(R.id.textView4);
        txtName.setText("Hiba Saqib");
        txtRoll.setText("BCSF18A540");
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web= Uri.parse("https://github.com/Hiba72/MC-Task03-Learn-Quran");
                intent=new Intent(Intent.ACTION_VIEW,web);
                startActivity(intent);
            }
        });

    }
}