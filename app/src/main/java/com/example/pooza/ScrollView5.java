package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ScrollView5 extends AppCompatActivity {
    ImageButton piña, platano, fresa,naranja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view5);

        piña = (ImageButton) findViewById(R.id.piña);
        platano = (ImageButton) findViewById(R.id.platano);
        fresa = (ImageButton) findViewById(R.id.fresa);
        naranja = (ImageButton) findViewById(R.id.naranja);


        piña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView5.this, "Primera Imagen", Toast.LENGTH_SHORT).show();
            }
        });

        platano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView5.this, "Segunda Imagen", Toast.LENGTH_SHORT).show();
            }
        });
        fresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView5.this, "Tercera Imagen", Toast.LENGTH_SHORT).show();
            }
        });
        naranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView5.this, "Cuarta Imagen", Toast.LENGTH_SHORT).show();
            }
        });


    }
}