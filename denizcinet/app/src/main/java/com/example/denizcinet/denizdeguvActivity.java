package com.example.denizcinet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class denizdeguvActivity extends AppCompatActivity {


    private Button buton37, buton30,buton17,buton35,buton36,
            buton23,buton34,buton9,buton20, buton27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denizdeguv);

        buton37=findViewById(R.id.button37);
        buton30=findViewById(R.id.button30);
        buton17=findViewById(R.id.button17);
        buton35=findViewById(R.id.button35);
        buton36=findViewById(R.id.button36);
        buton23=findViewById(R.id.button23);
        buton34=findViewById(R.id.button34);
        buton9=findViewById(R.id.button9);
        buton20=findViewById(R.id.button20);
        buton27=findViewById(R.id.button27);

        buton37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page37.class));
            }
        });
        buton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page30.class));
            }
        });
        buton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page17.class));
            }
        });
        buton35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page35.class));
            }
        });
        buton36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page36.class));
            }
        });
        buton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page23.class));
            }
        });
        buton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page34.class));
            }
        });
        buton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page9.class));
            }
        });
        buton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page20.class));
            }
        });
        buton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(denizdeguvActivity.this, page27.class));
            }
        });

    }
}
