package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IniciarSesion1 extends AppCompatActivity {

    Button iniciar, registrar;
    Button play_pause;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion1);

        iniciar = findViewById(R.id.btnIngresar20);
        registrar = findViewById(R.id.btnRegistrar20);
        play_pause = (Button) findViewById(R.id.play_pause);
        mp = MediaPlayer.create(this, R.raw.gogo);

        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()) {
                    mp.pause();
                    play_pause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(IniciarSesion1.this, "Ir", Toast.LENGTH_SHORT).show();
                } else {
                    mp.start();
                    play_pause.setBackgroundResource(R.drawable.pausa);
                    Toast.makeText(IniciarSesion1.this, "Ir a Registrarse", Toast.LENGTH_SHORT).show();
                }
            }
        });

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(IniciarSesion1.this, R.raw.mal);
                mp.start();
            }
        });


        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IniciarSesion1.this,RegistrarRegistro1.class);
                startActivity(intent);
            }
        });

    }

    public void enter(View view) {
        Intent intent = new Intent(IniciarSesion1.this,IniciarSesion1.class);
        startActivity(intent);
    }

    public void lets(View view) {
        Intent intent = new Intent(IniciarSesion1.this,RegistrarRegistro1.class);
        startActivity(intent);
    }
}