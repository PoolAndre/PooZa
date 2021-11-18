package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IniciarSesion2 extends AppCompatActivity {

    Button iniciar;
    Button play_pause;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion2);

        iniciar = findViewById(R.id.btnIngresar20);
        play_pause = (Button) findViewById(R.id.play_pause);
        mp = MediaPlayer.create(this, R.raw.correcto);

        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()) {
                    mp.pause();
                    play_pause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(IniciarSesion2.this, "", Toast.LENGTH_SHORT).show();
                } else {
                    mp.start();
                    play_pause.setBackgroundResource(R.drawable.pausa);
                    Toast.makeText(IniciarSesion2.this, "Ingreso Correcto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IniciarSesion2.this,Splash1.class);
                startActivity(intent);
            }
        });

    }

    public void irm(View view) {
        Intent intent = new Intent(IniciarSesion2.this, Splash1.class);
        startActivity(intent);

    }
}