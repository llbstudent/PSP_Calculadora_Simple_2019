package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Nos creamos las variables
    private Button btnSuma, btnResta, btnMultiplicar, btnDividir;
    private EditText tv1, tv2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controlador.getApplicationContext()

        //Nos creamos los objetos
        btnSuma         = findViewById(R.id.btnSuma);
        btnResta        = findViewById(R.id.btnResta);
        btnMultiplicar  = findViewById(R.id.btnMultiplicar);
        btnDividir      = findViewById(R.id.btnDividir);
        tv1             = findViewById(R.id.tv1);
        tv2             = findViewById(R.id.tv2);
        resultado       = findViewById(R.id.resultado);


        //Metodos con interfaz MISMO LISTENER

        //SUMA
        btnSuma.setOnClickListener(v -> {
            double num1 = Double.parseDouble(tv1.getText().toString());
            double num2 = Double.parseDouble(tv2.getText().toString());

            double num3 = num1 + num2;
            //Guardamos num3 en resultado
            resultado.setText(String.valueOf(num3));
        });

        btnResta.setOnClickListener(v  -> {
            double num1 = Double.parseDouble(tv1.getText().toString());
            double num2 = Double.parseDouble(tv2.getText().toString());

            double num3 = num1 - num2;
            //Guardamos num3 en resultado
            resultado.setText(String.valueOf(num3));
        });
    }
}
