package com.example.estudiante.practicajerry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_titulo;
    EditText et_nombre;
    Button boton_calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_titulo= findViewById(R.id.tv_titulo);
        et_nombre= findViewById(R.id.et_nombre);
        boton_calcular=  findViewById(R.id.boton_calcular);


        boton_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre= et_nombre.getText().toString();
                tv_titulo.setText("Hola " + nombre);
                if (nombre.equals("Cristian")|| nombre.equals("Jerry")){
                    tv_titulo.setText("Sr" +  nombre + "sos un crack");
                }else if (nombre.equals("Javier")){
                    tv_titulo.setText("Javier es el mas manco de Fornai");
                }

                Toast.makeText(MainActivity.this, "Hola" + nombre, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
