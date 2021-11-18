package com.example.pooza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ScrollView2 extends AppCompatActivity {
    ImageButton piña, platano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view2);

        piña = (ImageButton) findViewById(R.id.piña);
        platano = (ImageButton) findViewById(R.id.platano);


        piña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView2.this, "Primera Imagen", Toast.LENGTH_SHORT).show();
            }
        });

        platano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScrollView2.this, "Segunda Imagen", Toast.LENGTH_SHORT).show();
            }
        });

    }
}