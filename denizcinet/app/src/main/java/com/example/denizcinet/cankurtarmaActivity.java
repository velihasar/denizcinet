package com.example.denizcinet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cankurtarmaActivity extends AppCompatActivity {
private Button buton25, buton28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cankurtarma);

        buton25=findViewById(R.id.button25);
        buton28=findViewById(R.id.button28);

        buton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cankurtarmaActivity.this, page25.class));
            }
        });
        buton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cankurtarmaActivity.this, page28.class));
            }
        });
    }
}
