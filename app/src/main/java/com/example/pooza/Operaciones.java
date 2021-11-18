package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Operaciones extends AppCompatActivity {
    EditText etNro1, etNro2, etResultado;
    Button btnSumar, btnRestar,btnDividir,btnMultiplicar, btnSalir,btnLimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        etNro1 = (EditText) findViewById(R.id.etNro1);
        etNro2 = (EditText) findViewById(R.id.etNro2);
        etResultado = (EditText) findViewById(R.id.etResultado);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnLimpiar = (Button) findViewById(R.id.bLimpiar);

        btnSalir = (Button) findViewById(R.id.btnSalir);

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Limpiar();}
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento4 = new Intent(Operaciones.this, Calculos.class);
                startActivity(intento4);
            }
        });

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sumar();
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Restar();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dividir();
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Multiplicar();
            }
        });

    }
    private void Limpiar()
    {
        etNro1.setText("");
        etNro2.setText("");
        etResultado.setText("");
    }

    private void Multiplicar() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double multiplicacion = nro1 * nro2;
        etResultado.setText(String.valueOf(multiplicacion));
    }

    private void Dividir() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        if (nro2 == 0)
            etResultado.setText("Error: Division entre 0");
        else
        {
            double division = nro1 / nro2;
            etResultado.setText(String.valueOf(division));
        }
    }

    private void Restar() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double resta = nro1 - nro2;
        etResultado.setText(String.valueOf(resta));
    }

    private void Sumar() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double suma = nro1 + nro2;
        etResultado.setText(String.valueOf(suma));

    }

}