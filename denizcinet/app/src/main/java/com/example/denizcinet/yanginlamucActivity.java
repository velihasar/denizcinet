package com.example.denizcinet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yanginlamucActivity extends AppCompatActivity {
private Button buton12, buton18, buton4,buton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yanginlamuc);

        buton12=findViewById(R.id.button12);
        buton18=findViewById(R.id.button18);
        buton4=findViewById(R.id.button4);
        buton5=findViewById(R.id.button5);

        buton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(yanginlamucActivity.this, page12.class));
            }
        });
        buton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(yanginlamucActivity.this, page18.class));
            }
        });
        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(yanginlamucActivity.this, page4Activity.class));
            }
        });
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(yanginlamucActivity.this, page5Activity.class));
            }
        });
    }
}
