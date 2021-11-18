package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menuprincipal extends AppCompatActivity {

    Button ingresar;
    Button valor;
    Button nive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);

        ingresar = findViewById(R.id.btn2);


        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menuprincipal.this, ActivityWeb.class);
                startActivity(intent);
            }
        });


    }

    public void ir(View view) {
        Intent intent = new Intent(Menuprincipal.this, ActivityWeb.class);
        startActivity(intent);
    }

    public void uno(View view) {
        Intent iuno= new Intent(Menuprincipal.this, ScrollView1.class);
        startActivity(iuno);

    }

    public void dos(View view) {
        Intent idos = new Intent(Menuprincipal.this, ScrollView2.class);
        startActivity(idos);
    }

    public void tres(View view) {
        Intent itres = new Intent(Menuprincipal.this, ScrollView3.class);
        startActivity(itres);
    }

    public void cuatro(View view) {
        Intent icuatro = new Intent(Menuprincipal.this, ScrollView4.class);
        startActivity(icuatro);
    }

    public void cinco(View view) {
        Intent icinco = new Intent(Menuprincipal.this, ScrollView5.class);
        startActivity(icinco);
    }

    public void seis(View view) {
        Intent iseis = new Intent(Menuprincipal.this, ScrollView6.class);
        startActivity(iseis);
    }

    public void siete(View view) {
        Intent isiete = new Intent(Menuprincipal.this, Calculos.class);
        startActivity(isiete);
    }

    public void ocho(View view) {
        Intent iocho = new Intent(Menuprincipal.this, ScrollView81.class);
        startActivity(iocho);
    }
}