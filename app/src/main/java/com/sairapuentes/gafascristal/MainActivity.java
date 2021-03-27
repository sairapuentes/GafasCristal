package com.sairapuentes.gafascristal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo Salir
    public void salir(View view) {
        Intent salir =new Intent(Intent.ACTION_MAIN);
        salir.addCategory(Intent.CATEGORY_HOME);
        salir.setFlags((Intent.FLAG_ACTIVITY_NEW_TASK));
        startActivity(salir);
    }


    public void Registrarse(View view) {
        Intent registrar= new Intent(this, Registrarse.class);
        startActivity(registrar);
    }
}