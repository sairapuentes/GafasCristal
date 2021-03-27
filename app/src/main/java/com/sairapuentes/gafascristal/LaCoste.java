package com.sairapuentes.gafascristal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LaCoste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la_coste);
    }

    //Metodo Salir
    public void salir(View view) {
        Intent salir =new Intent(Intent.ACTION_MAIN);
        salir.addCategory(Intent.CATEGORY_HOME);
        salir.setFlags((Intent.FLAG_ACTIVITY_NEW_TASK));
        startActivity(salir);
    }

    //Metodo para regresar

    public void Regresar(View view){
        Intent regresar= new Intent(this, Productos.class);
        startActivity(regresar);
    }
}