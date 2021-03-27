package com.sairapuentes.gafascristal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Descripcionrayban1 extends AppCompatActivity {

    RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcionrayban1);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
    }

    public void Regresar(View view) {
        Intent regresar= new Intent(this, RayBan.class);
        startActivity(regresar);
    }

    public void salir(View view) {
        Intent salir =new Intent(Intent.ACTION_MAIN);
        salir.addCategory(Intent.CATEGORY_HOME);
        salir.setFlags((Intent.FLAG_ACTIVITY_NEW_TASK));
        startActivity(salir);
    }

    public void comprar(View view) {
        String seleccion= "Compra color: \n";
        if (rb1.isChecked()){
            seleccion+="Oro\n";
        }
        if (rb2.isChecked()){
            seleccion+="Metal Azul\n";
        }
        if (rb3.isChecked()){
            seleccion+="Metal Negro\n";
        }
        if (rb4.isChecked()){
            seleccion+="Rojo\n";
        }
        Toast.makeText(getApplicationContext(),seleccion, Toast.LENGTH_LONG).show();


    }
}