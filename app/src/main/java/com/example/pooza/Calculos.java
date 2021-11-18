package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Calculos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos);
    }
    public void calculadora(View view){
        Intent icalculadora = new Intent(Calculos.this, Operaciones.class);
        startActivity(icalculadora);
    }
    public void salud(View view){
        Intent isalud = new Intent(Calculos.this, Salud.class);
        startActivity(isalud);
    }
    public void salir(View view){
        finish();
    }
    public void poto(View view) {
        Intent ipoto = new Intent(Calculos.this, Photo.class);
        startActivity(ipoto);
    }

}