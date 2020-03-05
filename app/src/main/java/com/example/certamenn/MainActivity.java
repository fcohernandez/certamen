package com.example.certamenn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonGeneraNum = (Button) findViewById(R.id.generaNum);
        Button botonSuma = (Button) findViewById(R.id.botonSumar);
        Button botonResta = (Button) findViewById(R.id.botonRestar);
        Button botonMul = (Button) findViewById(R.id.botonMult);
        Button botonDiv = (Button) findViewById(R.id.botonDiv);
        Button botonClear = (Button) findViewById(R.id.botonLimpiar);
        Button botonPar = (Button) findViewById(R.id.botonVerPar);
        Button botonPrimo = (Button) findViewById(R.id.botonVerPrimo);

        final TextView botonNum1 = (TextView) findViewById(R.id.num1);
        final TextView botonNum2 = (TextView) findViewById(R.id.num2);
        final TextView res = (TextView) findViewById(R.id.botonResOp);
        final TextView parPrimo = (TextView) findViewById(R.id.botonResParPrimo);

        botonGeneraNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                random = new Random();
                int x = 2;
                double num1 = random.nextDouble() * 100;
                double num2 = random.nextDouble()* 100;

                botonNum1.setText(Double.toString(num1));
                botonNum2.setText(Double.toString(num2));

                res.setText(Double.toString(0));

            }
        });

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = botonNum1.getText().toString();
                double num1 = Double.valueOf(num);

                num = botonNum2.getText().toString();
                double num2 = Double.valueOf(num);

                double resultado = num1 + num2;

                res.setText(Double.toString(resultado));

            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = botonNum1.getText().toString();
                double num1 = Double.valueOf(num);

                num = botonNum2.getText().toString();
                double num2 = Double.valueOf(num);

                double resultado = num1 - num2;

                res.setText(Double.toString(resultado));

            }
        });

        botonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(Double.toString(0));
                botonNum1.setText(Double.toString(0));
                botonNum2.setText(Double.toString(0));
                parPrimo.setText("?");
            }
        });

        botonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = botonNum1.getText().toString();
                double num1 = Double.valueOf(num);

                num = botonNum2.getText().toString();
                double num2 = Double.valueOf(num);

                double resultado = num1 * num2;

                res.setText(Double.toString(resultado));

            }
        });

        botonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = botonNum1.getText().toString();
                double num1 = Double.valueOf(num);

                num = botonNum2.getText().toString();
                double num2 = Double.valueOf(num);

                double resultado = num1 / num2;

                res.setText(Double.toString(resultado));

            }
        });

        botonPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = res.getText().toString();

                double num = Double.valueOf(resultado);

                if(num == 0.0){
                    parPrimo.setText("?");
                }

                if((int)num%2 == 0){
                    parPrimo.setText("Es par");
                }else{
                    parPrimo.setText("Es impar");
                }
            }
        });

        botonPrimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = res.getText().toString();

                double num = Double.valueOf(resultado);

                for(int i = 1; i < 100; i++){
                    if((num%i)!= 0){
                        parPrimo.setText("No es primo");
                        break;
                    }else{
                        parPrimo.setText("Es primo");
                    }
                }

            }
        });
    }
}
