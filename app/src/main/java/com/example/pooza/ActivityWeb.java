package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityWeb extends AppCompatActivity {

    ImageButton codigo;
    EditText et1;
    Button atras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        //enlazar la parte logica y diseño
        et1 = (EditText) findViewById(R.id.txt_web);
        codigo = findViewById(R.id.btnCodigo);
        atras = findViewById(R.id.btnRetroceder);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento4 = new Intent(ActivityWeb.this, Menuprincipal.class);
                startActivity(intento4);
            }
        });


        codigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityWeb.this, "Esta es: 460517477293388/", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //metodo boton ir
    public void Navegar(View view) {
        //Se establecen cambios de pantallas o activitys
        Intent i = new Intent(this, ActivityWeb1.class);
        //enviar parametros intent ,  metodo put extra
        i.putExtra("SitioWeb", et1.getText().toString());
        startActivity(i);
    }

    public void cod(View view) {
    }
}