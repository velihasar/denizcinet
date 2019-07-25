package com.example.denizcinet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        PDFView pdfView=(PDFView) findViewById(R.id.pdfView2);

        pdfView.fromAsset("2.pdf").load();
    }
}
