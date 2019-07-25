package com.example.denizcinet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stabiliteActivity extends AppCompatActivity {
private Button buton31, buton29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stabilite);

        buton31=findViewById(R.id.button31);
        buton29=findViewById(R.id.button29);

        buton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(stabiliteActivity.this, page29.class));
            }
        });
        buton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(stabiliteActivity.this, page31.class));
            }
        });
    }
}
