package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.txtSaludo);


        Bundle bundle =this.getIntent().getExtras();


        txtSaludo.setText("Hola!, " +bundle.getString());
    }
}