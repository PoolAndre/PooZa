package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb1 extends AppCompatActivity {
    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);

        wv1 = (WebView) findViewById(R.id.wv1);

        //recuperar valores por el intent
        String URL = getIntent().getStringExtra("SitioWeb");
        //permitira al user navegar solo en el app
        wv1.setWebViewClient(new WebViewClient());
        //abrira el sitio que solicito
        wv1.loadUrl("http://web.facebook.com/Horacio-Zevallos-Gamez-" + URL);
    }

    public void Exit(View view){
        finish();
    }
}