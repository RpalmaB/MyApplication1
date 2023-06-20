package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btEnviar(View view){

        EditText txtNombre =(EditText)findViewById(R.id.txtNombre);
        EditText txtApellido =(EditText)findViewById(R.id.txtApeliido);
        RadioButton rbMasc =(RadioButton) findViewById(R.id.rbMasculino);
        Switch swNotificaciones = (Switch)findViewById(R.id.swAlerta);

        String genero, nombre, apellido, notificaciones;

        nombre = txtNombre.getText().toString();
        apellido = txtApellido.getText().toString();
        notificaciones = swNotificaciones.isChecked()?"SI":"NO";
        genero = "Estimad" + (rbMasc.isChecked()?"o":"a");


        Toast.makeText(this.getApplicationContext(), " Hola " + genero + " " + nombre + " " +
                        apellido + ", Notificaciones " + notificaciones + " " +
                        txtNombre.getText().toString() + "" +txtApellido.getText().toString(),
                Toast.LENGTH_SHORT).show();

        
        Intent intent = new intent (MainActivity.this, MainActivity2.class);
        Bundle b = new Bundle();
        b.putString("NOMBRE", nombre);
        b.putString("APELLIDO", apellido);
        b.putString("GENERO", genero);
        b.putString("NOTIFICACIONES", notificaciones);
        intent.putExtras(b);
        startActivity(intent);


    }
}