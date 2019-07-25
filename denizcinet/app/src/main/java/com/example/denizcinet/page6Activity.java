package com.example.denizcinet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class page6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        PDFView pdfView=(PDFView) findViewById(R.id.pdfView6);

        pdfView.fromAsset("6.pdf").load();
    }
}
