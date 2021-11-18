package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegistrarRegistro1 extends AppCompatActivity {

    Button registrate;
    Button play_pause;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_registro1);

        registrate = findViewById(R.id.Registrar15);


        play_pause = (Button) findViewById(R.id.play_pause);
        mp = MediaPlayer.create(this, R.raw.bien);

        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()) {
                    mp.pause();
                    play_pause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(RegistrarRegistro1.this, "", Toast.LENGTH_SHORT).show();
                } else {
                    mp.start();
                    play_pause.setBackgroundResource(R.drawable.pausa);
                    Toast.makeText(RegistrarRegistro1.this, "Se registro Correctamente", Toast.LENGTH_SHORT).show();
                }
            }
        });

        registrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrarRegistro1.this, IniciarSesion2.class);
                startActivity(intent);
            }
        });


    }

    public void reg(View view) {
        Intent intent = new Intent(RegistrarRegistro1.this, IniciarSesion2.class);
        startActivity(intent);
    }
}