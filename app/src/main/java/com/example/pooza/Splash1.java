package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Splash1 extends AppCompatActivity {

    ImageButton pool, zareth;
    Button ingresar;
    Button play_pause;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);

        pool = (ImageButton) findViewById(R.id.btnPool);
        zareth = (ImageButton) findViewById(R.id.btnZareth);
        ingresar = (Button) findViewById(R.id.btnIngresar);

        play_pause = (Button) findViewById(R.id.play_pause);
        mp = MediaPlayer.create(this, R.raw.wearethechampions);

        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()) {
                    mp.pause();
                    play_pause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(Splash1.this, "H. Z. G.", Toast.LENGTH_SHORT).show();
                } else {
                    mp.start();
                    play_pause.setBackgroundResource(R.drawable.pausa);
                    Toast.makeText(Splash1.this, "H. Z. G.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        pool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Splash1.this, "Pool Andre Salva Palomino", Toast.LENGTH_SHORT).show();
            }
        });

        zareth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Splash1.this, "Zareth Guisell Huaman Amache", Toast.LENGTH_SHORT).show();
            }
        });

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Splash1.this, Menuprincipal.class);
                startActivity(intent);
            }
        });

    }

    public void env(View view) {
        Intent intent = new Intent(Splash1.this, Menuprincipal.class);
        startActivity(intent);
    }
}