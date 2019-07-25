package com.example.denizcinet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class imdgActivity extends AppCompatActivity {
private Button buton22,buton33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imdg);

        buton22=findViewById(R.id.button22);
        buton33=findViewById(R.id.button33);
        buton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(imdgActivity.this, page22.class));
            }
        });
        buton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(imdgActivity.this, page33.class));
            }
        });
    }
}
