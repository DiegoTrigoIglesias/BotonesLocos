package com.example.botones_locos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        Button boton0,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,boton11,boton12;
        Button aleatorio;
        Random r;
        int salida,salida1,salida2,salida3,salida4,salida5,salida6,salida7,salida8,salida9,salida10,salida11,salida12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r =new Random(); //numero aleatorio a generar una vez pulsado el boton
        boton0 =(Button) findViewById(R.id.b1); //boton de ejecucion
        boton1 =(Button) findViewById(R.id.b2); //boton de ejecucion
        boton2 =(Button) findViewById(R.id.b3); //boton de ejecucion
        boton3 =(Button) findViewById(R.id.b4); //boton de ejecucion
        boton4 =(Button) findViewById(R.id.b5); //boton de ejecucion
        boton5 =(Button) findViewById(R.id.b6); //boton de ejecucion
        boton6 =(Button) findViewById(R.id.b7); //boton de ejecucion
        boton7 =(Button) findViewById(R.id.b8); //boton de ejecucion
        boton8 =(Button) findViewById(R.id.b9); //boton de ejecucion
        boton9 =(Button) findViewById(R.id.b10); //boton de ejecucion
        boton10 =(Button) findViewById(R.id.b11); //boton de ejecucion
        boton11 =(Button) findViewById(R.id.b12); //boton de ejecucion
        aleatorio=(Button) findViewById(R.id.aleatorio); //boton para poner a todos aleatorios

        aleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida1 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida2 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida3 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida4 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida5 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida6 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida7 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida8 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida9 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida10 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                salida11 = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores

                boton0.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
                boton1.setText(String.valueOf(salida1)); //pasamos el numero a la etiqueta
                boton2.setText(String.valueOf(salida2)); //pasamos el numero a la etiqueta
                boton3.setText(String.valueOf(salida3)); //pasamos el numero a la etiqueta
                boton4.setText(String.valueOf(salida4)); //pasamos el numero a la etiqueta
                boton5.setText(String.valueOf(salida5)); //pasamos el numero a la etiqueta
                boton6.setText(String.valueOf(salida6)); //pasamos el numero a la etiqueta
                boton7.setText(String.valueOf(salida7)); //pasamos el numero a la etiqueta
                boton8.setText(String.valueOf(salida8)); //pasamos el numero a la etiqueta
                boton9.setText(String.valueOf(salida9)); //pasamos el numero a la etiqueta
                boton10.setText(String.valueOf(salida10)); //pasamos el numero a la etiqueta
                boton11.setText(String.valueOf(salida11)); //pasamos el numero a la etiqueta
            }
        });


        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton0.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton1.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton2.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton3.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton4.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton5.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton6.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton7.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton8.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton9.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton10.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
        boton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //accion del boton al pulsarse
                salida = r.nextInt(98 - 1) + 1; //se genera un numero entre los valores
                boton11.setText(String.valueOf(salida)); //pasamos el numero a la etiqueta
            }
        });
    }
}
