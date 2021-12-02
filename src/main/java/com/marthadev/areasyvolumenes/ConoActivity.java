package com.marthadev.areasyvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConoActivity extends AppCompatActivity {
    Intent intent;
    EditText txtRadioC, txtGenCono, txtAlturaCono;
    Button btnCalcularCono, Regresar;
    TextView tvResCono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        txtRadioC = findViewById(R.id.txtRadioC);
        txtGenCono = findViewById(R.id.txtGenCono);
        txtAlturaCono = findViewById(R.id.txtAlturaCono);
        btnCalcularCono = findViewById(R.id.btnCalcularCono);
        tvResCono = findViewById(R.id.tvResCono);

        btnCalcularCono.setOnClickListener(view -> {
            int Radio = Integer.parseInt(String.valueOf(txtRadioC.getText()));
            int Generatriz = Integer.parseInt(String.valueOf(txtGenCono.getText()));
            int Altura = Integer.parseInt(String.valueOf(txtAlturaCono.getText()));
            double area, volumen;
            double pi = 3.1416;
            area = (pi * Radio) * (Generatriz + Radio);
            volumen = (pi * (Radio*Radio)* Altura)/3;
            tvResCono.setText("El area del cono es: "+area+" cm2 \nVolumen: "+volumen+" cm3");
        });

        Regresar = findViewById(R.id.btnRegresarCono);
        Regresar.setOnClickListener(v -> {
            intent = new Intent(ConoActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}