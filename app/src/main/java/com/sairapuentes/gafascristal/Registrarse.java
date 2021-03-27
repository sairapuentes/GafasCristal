package com.sairapuentes.gafascristal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrarse extends AppCompatActivity {

    private EditText nom,cedu,tel,corre,dir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        nom = (EditText) findViewById(R.id.nombre);
        cedu = (EditText) findViewById(R.id.cedula);
        tel = (EditText) findViewById(R.id.telefono);
        corre = (EditText) findViewById(R.id.correo);
        dir = (EditText) findViewById(R.id.direccion);

    }

    public void Regresar(View view) {
        Intent regresar= new Intent(this, MainActivity.class);
        startActivity(regresar);
    }

    public void salir(View view) {
        Intent salir =new Intent(Intent.ACTION_MAIN);
        salir.addCategory(Intent.CATEGORY_HOME);
        salir.setFlags((Intent.FLAG_ACTIVITY_NEW_TASK));
        startActivity(salir);
    }

    public void continuar(View view) {
        String nombre = nom.getText().toString();
        String cedula = cedu.getText().toString();
        String telefono = tel.getText().toString();
        String correo = corre.getText().toString();
        String direccion = dir.getText().toString();

        if(nombre.length()==0){
            Toast.makeText(this,"Ingresar Nombre", Toast.LENGTH_LONG).show();
        }
        if(cedula.length()==0){
            Toast.makeText(this,"Ingresar Cedula", Toast.LENGTH_LONG).show();
        }
        if(telefono.length()==0){
            Toast.makeText(this,"Ingresar Numero de Telefono", Toast.LENGTH_LONG).show();
        }
        if(correo.length()==0){
            Toast.makeText(this,"Ingresar Correo Electronico", Toast.LENGTH_LONG).show();
        }
        if(direccion.length()==0){
            Toast.makeText(this,"Ingresar Direccion", Toast.LENGTH_LONG).show();
        }

        if(nombre.length() != 0 && cedula.length() != 0 && telefono.length() != 0 && correo.length() != 0 && direccion.length() != 0){
            Intent continuar= new Intent(this, Productos.class);
            continuar.putExtra("nombre",nom.getText().toString());
            startActivity(continuar);
        }

    }
}