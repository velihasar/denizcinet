package com.example.denizcinet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class page33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page33);
        PDFView pdfView=(PDFView) findViewById(R.id.pdfView33);

        pdfView.fromAsset("33.pdf").load();
    }
}
