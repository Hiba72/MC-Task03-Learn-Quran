package com.example.learnquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    Intent intent1;
    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView txt =findViewById(R.id.textView12);
        intent1=getIntent();
        txt.setText("You scored "+intent1.getStringExtra("scoree")+"/"+intent1.getStringExtra("totall"));
        Button btnShare=findViewById(R.id.button21);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt.getText().toString();
                intent2=new Intent();
                intent2.setAction(Intent.ACTION_SEND);
                intent2.setType("text/plain");
                intent2.putExtra(intent2.EXTRA_TEXT,message);
                startActivity(intent2);
            }
        });

    }
}