package com.marthadev.areasyvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EsferaActivity extends AppCompatActivity {

    Intent intent;
    EditText txtRadio;
    Button btnCalcularE, Regresar;
    TextView txtResultado;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        txtRadio = findViewById(R.id.txtRadio);
        btnCalcularE = findViewById(R.id.btnCalcularE);
        txtResultado = findViewById(R.id.txtResultado);

        btnCalcularE.setOnClickListener(view -> {
            int Radio = Integer.parseInt(String.valueOf(txtRadio.getText()));
            double area, volumen, res1;
            double pi = 3.1416;
            area = 4 * pi * (Radio*Radio);
            res1 = 4 * pi * (Radio*Radio*Radio);
            volumen = res1/3;
            txtResultado.setText("El area de la esfera es: "+area+" cm2 \nVolumen: "+volumen+ " cm3");
        });

        Regresar = findViewById(R.id.btnERegresar);
        Regresar.setOnClickListener(v -> {
            intent = new Intent(EsferaActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}