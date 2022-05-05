package com.example.controlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        String url = getIntent().getStringExtra("SitioWeb");
        wb = (WebView) findViewById(R.id.wv1);

        wb.getSettings().setLoadsImagesAutomatically(true);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        wb.setWebViewClient(new WebViewClient());

        wb.loadUrl(url);
    }


    public void btnCerrar(View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
        startActivity(intent);
    }
}