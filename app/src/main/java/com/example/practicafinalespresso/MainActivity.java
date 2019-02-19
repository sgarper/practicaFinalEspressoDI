package com.example.practicafinalespresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText original;
Button kms,millas,f,c;
TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        original=findViewById(R.id.original);
        kms=findViewById(R.id.kms);
        millas=findViewById(R.id.millas);
        f=findViewById(R.id.f);
        c=findViewById(R.id.c);
        resultado=findViewById(R.id.resultado);



        kms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conversor c=new Conversor();
                resultado.setText(c.millasAkms(original.getText().toString()));
            }
        });
        millas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conversor c=new Conversor();
                resultado.setText(c.kmsAmillas(original.getText().toString()));
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conversor c=new Conversor();
                resultado.setText(c.celsiusAFahrenheit(original.getText().toString()));
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conversor c=new Conversor();
                resultado.setText(c.fahrenheitACelsius(original.getText().toString()));
            }
        });
    }
}
