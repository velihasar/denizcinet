package com.example.denizcinet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class info extends AppCompatActivity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        textView=findViewById(R.id.info);

        textView.setText("Kütüphane içeriği sürekli güncellenecektir.\n\n" +
                "\"Videolar ve Siteye Git\" kısımları internet bağlantısı gerektirir.\n\n" +
                "Bizlere video ve fotoğraflarınızı \n \"instagram:denizcinindefteri\" veya \n \"iletisim@denizci.net\" e-posta adresinden ulaştırabilirsiniz.\n\n" +
                "Pruvanız Neta Denizleriniz Sakin Olsun.");

    }
}
