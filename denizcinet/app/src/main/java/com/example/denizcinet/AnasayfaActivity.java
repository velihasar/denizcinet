package com.example.denizcinet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnasayfaActivity extends AppCompatActivity {
    private Button ButKutuphane ,Butvideolar,butSiteyeGiris,butInfo;
    private  long backPressTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);



        butInfo=findViewById(R.id.info);
        butSiteyeGiris=findViewById(R.id.siteyegiris);
        ButKutuphane= findViewById(R.id.kutuphane);
        Butvideolar=findViewById(R.id.videolar);

        ButKutuphane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(AnasayfaActivity.this, KutuphaneActivity.class));

            }
        });
        butSiteyeGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(AnasayfaActivity.this, siteyegiris.class));

            }
        });
        Butvideolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(AnasayfaActivity.this, videolar.class));

            }
        });
        butInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(AnasayfaActivity.this, info.class));

            }
        });


    }

    public void onBackPressed(){
        backPressTime= (backPressTime + 1);
        Toast.makeText(getApplicationContext(), "Çıkış Yapmak İçin Tekrar Dokunun", Toast.LENGTH_SHORT).show();

        if (backPressTime>1) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }

}
