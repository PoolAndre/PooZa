package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollView81 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view81);
    }

    public void fruta(View view) {
        Intent ifruta = new Intent(ScrollView81.this, ScrollView8.class);
        startActivity(ifruta);
    }
}