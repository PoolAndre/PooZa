package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    public static final long SPLAH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //implementar tiempo
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(Splash.this, IniciarSesion1.class);
                startActivity(intent);
                finish();
            }
        };
        // se ejecuta una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time,SPLAH_SCREEN_DELAY);
    }
}