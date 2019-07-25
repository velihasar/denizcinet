package com.example.denizcinet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KutuphaneActivity extends AppCompatActivity {
private Button cankurtarma, colreg,denizdeguv, imdg,kaptaninklav,marpol,
    meteoro,roletalim,saglik,solas,stabilite,yanginlamuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kutuphane);

        cankurtarma = findViewById(R.id.cankurtarma);
        colreg = findViewById(R.id.colreg);
        denizdeguv = findViewById(R.id.denizdeguvenlik);
        imdg = findViewById(R.id.imdg);
        kaptaninklav = findViewById(R.id.kaptanklavuzu);
        marpol = findViewById(R.id.marpol);
        meteoro = findViewById(R.id.meteoroloji);
        roletalim = findViewById(R.id.roletalimleri);
        saglik = findViewById(R.id.saglik);
        solas = findViewById(R.id.solas);
        stabilite = findViewById(R.id.stabilite);
        yanginlamuc = findViewById(R.id.yanginlamucadele);

        cankurtarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, cankurtarmaActivity.class));
            }
        });
        colreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, page6Activity.class));
            }
        });
        denizdeguv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, denizdeguvActivity.class));
            }
        });
        imdg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, imdgActivity.class));
            }
        });
        kaptaninklav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this,  page26.class));
            }
        });
        marpol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, page8.class));
            }
        });
        meteoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, page15.class));
            }
        });
        roletalim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, page13.class));
            }
        });
        saglik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, saglikActivity.class));
            }
        });
        solas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, page7.class));
            }
        });
        stabilite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, stabiliteActivity.class));
            }
        });
        yanginlamuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KutuphaneActivity.this, yanginlamucActivity.class));
            }
        });

    }
}
