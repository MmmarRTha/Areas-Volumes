package com.marthadev.areasyvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CilindroActivity extends AppCompatActivity {
    Intent intent;
    EditText txtRadioCili, txtAlturaCil;
    Button btnCalcularCil, Regresar;
    TextView tvResCil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        txtAlturaCil = findViewById(R.id.txtAlturaCil);
        txtRadioCili = findViewById(R.id.txtRadioCili);
        btnCalcularCil = findViewById(R.id.btnCalcularCil);
        tvResCil = findViewById(R.id.tvResCil);

        btnCalcularCil.setOnClickListener(view -> {
            double Radio = Double.parseDouble(String.valueOf(txtRadioCili.getText()));
            int Altura = Integer.parseInt(String.valueOf(txtAlturaCil.getText()));
            double areaL, areaT, areaB, volumen;
            double pi = 3.1416;
            areaL = (2*pi*Radio)*Altura;
            areaB = pi * (Radio*Radio);
            areaT = areaL + 2*(areaB);
            volumen = areaB*Altura;
            tvResCil.setText("El área del cilindro es: "+areaT+ " cm2 \nVolumen: "+volumen+" cm3");
        });

        Regresar = findViewById(R.id.btnRegresarCil);
        Regresar.setOnClickListener(v -> {
            intent = new Intent(CilindroActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}