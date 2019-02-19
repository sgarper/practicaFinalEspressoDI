package com.example.practicafinalespresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * @author Sergio
     * <p>Declaracion de variables</p>
     */
    EditText original;
Button kms,millas,f,c;
TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * <p></p>
         */
        original=findViewById(R.id.original);
        kms=findViewById(R.id.kms);
        millas=findViewById(R.id.millas);
        f=findViewById(R.id.f);
        c=findViewById(R.id.c);
        resultado=findViewById(R.id.resultado);

        /**
         * <p>Boton kms que se encarga de que al clickar en el, muestra el resultado de la conversion de millas a kilometros</p>
         * <p>Primero se declara el metodo conversor y despues le asignas al texto resultado su metodo correspondiente</p>
         */
        kms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conversor c=new Conversor();
                resultado.setText(c.millasAkms(original.getText().toString()));
            }
        });

        /**
         * <p>Boton millas que se encarga de que al clickar en el, muestra el resultado de la conversion de kilometros a millas</p>
         * <p>Primero se declara el metodo conversor y despues le asignas al texto resultado su metodo correspondiente</p>
         */
        millas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conversor c=new Conversor();
                resultado.setText(c.kmsAmillas(original.getText().toString()));
            }
        });

        /**
         * <p>Boton f que se encarga de que al clickar en el, muestra el resultado de la conversion de celsius a Fahrenheit</p>
         * <p>Primero se declara el metodo conversor y despues le asignas al texto resultado su metodo correspondiente</p>
         */
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conversor c=new Conversor();
                resultado.setText(c.celsiusAFahrenheit(original.getText().toString()));
            }
        });

        /**
         * <p>Boton c que se encarga de que al clickar en el, muestra el resultado de la conversion de Fahrenheit a celsius</p>
         * <p>Primero se declara el metodo conversor y despues le asignas al texto resultado su metodo correspondiente</p>
         */
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conversor c=new Conversor();
                resultado.setText(c.fahrenheitACelsius(original.getText().toString()));
            }
        });
    }
}
