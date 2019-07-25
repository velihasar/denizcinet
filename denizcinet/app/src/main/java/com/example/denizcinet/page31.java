package com.example.denizcinet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class page31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page31);
        PDFView pdfView=(PDFView) findViewById(R.id.pdfView31);

        pdfView.fromAsset("31.pdf").load();
    }
}
