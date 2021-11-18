package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ScrollView4 extends AppCompatActivity {
    ImageButton piña, platano, fresa,naranja, uva, papaya, mandarina, manzana, mango, pera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view4);

        piña = (ImageButton) findViewById(R.id.piña);
        platano = (ImageButton) findViewById(R.id.platano);
        fresa = (ImageButton) findViewById(R.id.fresa);
        naranja = (ImageButton) findViewById(R.id.naranja);
        uva = (ImageButton) findViewById(R.id.uva);
        papaya = (ImageButton) findViewById(R.id.papaya);
        mandarina = (ImageButton) findViewById(R.id.mandarina);
        manzana = (ImageButton) findViewById(R.id.manzana);
        mango = (ImageButton) findViewById(R.id.mango);
        pera = (ImageButton) findViewById(R.id.pera);

        piña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Primera Imagen", Toast.LENGTH_SHORT).show();
            }
        });

        platano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Segunda Imagen", Toast.LENGTH_SHORT).show();
            }
        });
        fresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Tercera Imagen", Toast.LENGTH_SHORT).show();
            }
        });
        naranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Cuarta Imagen", Toast.LENGTH_SHORT).show();
            }
        });

        uva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Quinta Imagen", Toast.LENGTH_SHORT).show();
            }
        });

        papaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Sexta Imagen", Toast.LENGTH_SHORT).show();
            }
        });
        mandarina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Septima Imagen", Toast.LENGTH_SHORT).show();
            }
        });
        manzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Octava Imagen", Toast.LENGTH_SHORT).show();
            }
        });
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Novena Imagen", Toast.LENGTH_SHORT).show();
            }
        });
        pera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView4.this, "Decima Imagen", Toast.LENGTH_SHORT).show();
            }
        });
    }
}