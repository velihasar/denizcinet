package com.example.denizcinet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class saglikActivity extends AppCompatActivity {
private Button buton14,buton16,buton2,buton19,buton24,buton32,buton21,buton10,buton1,buton3,buton11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saglik);

        buton14=findViewById(R.id.button14);
        buton16=findViewById(R.id.button16);
        buton2=findViewById(R.id.button2);
        buton19=findViewById(R.id.button19);
        buton24=findViewById(R.id.button24);
        buton32=findViewById(R.id.button32);
        buton10=findViewById(R.id.button10);
        buton1=findViewById(R.id.button1);
        buton3=findViewById(R.id.button3);
        buton11=findViewById(R.id.button11);
        buton21=findViewById(R.id.button21);


        buton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page14.class));
            }
        });
        buton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page16.class));
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page2Activity.class));
            }
        });
        buton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page19.class));
            }
        });
        buton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page24.class));
            }
        });
        buton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page32.class));
            }
        });
        buton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page10.class));
            }
        });
        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page1Activity.class));
            }
        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page3Activity.class));
            }
        });
        buton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page11.class));
            }
        });
        buton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saglikActivity.this, page21.class));
            }
        });
    }
}
