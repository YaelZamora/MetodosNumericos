package com.numericos.metodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button interpolacion, interpolacion2, ajusteCurvas, puntoFijo, reglaSimpson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interpolacion = (Button) findViewById(R.id.MetodoInterpolacion);
        interpolacion2 = (Button) findViewById(R.id.MetodoInterpolacion2);
        ajusteCurvas = (Button) findViewById(R.id.AjusteCurvas);
        puntoFijo = (Button) findViewById(R.id.PuntoFijo);
        reglaSimpson = (Button) findViewById(R.id.ReglaSimpson);

        interpolacion.setOnClickListener(this);
        interpolacion2.setOnClickListener(this);
        ajusteCurvas.setOnClickListener(this);
        puntoFijo.setOnClickListener(this);
        reglaSimpson.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.MetodoInterpolacion:
                Intent intent = new Intent(MainActivity.this, Interpolacion1.class);
                startActivity(intent);
                break;

            case R.id.MetodoInterpolacion2:
                Intent intent1 = new Intent(MainActivity.this, Interpolacion2.class);
                startActivity(intent1);
                break;

            case R.id.AjusteCurvas:
                Intent intent2 = new Intent(MainActivity.this, AjusteCurvas.class);
                startActivity(intent2);
                break;

            case R.id.PuntoFijo:
                Intent intent3 = new Intent(MainActivity.this, PuntoFijo.class);
                startActivity(intent3);
                break;

            case R.id.ReglaSimpson:
                Intent intent4 = new Intent(MainActivity.this, ReglaSimpson.class);
                startActivity(intent4);
                break;
        }
    }
}
