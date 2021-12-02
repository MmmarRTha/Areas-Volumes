package com.marthadev.areasyvolumenes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button Esfera, Cilindro, Cono, Salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Esfera = findViewById(R.id.btnEsfera);
        Esfera.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, EsferaActivity.class);
            startActivity(intent);
        });

        Cilindro = findViewById(R.id.btnPantallaCilindro);
        Cilindro.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, CilindroActivity.class);
            startActivity(intent);
        });

        Cono = findViewById(R.id.btnCono);
        Cono.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, ConoActivity.class);
            startActivity(intent);
        });

        Salir = findViewById(R.id.btnSalir);
        Salir.setOnClickListener(v -> {
            finish();
        });
    }
}