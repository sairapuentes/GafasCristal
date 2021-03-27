package com.sairapuentes.gafascristal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Productos extends AppCompatActivity {

    TextView bienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        bienvenida=(TextView) findViewById(R.id.bienvenida);
        String bienve = getIntent().getStringExtra("nombre");
        bienvenida.setText("Bienvenid@  "+bienve);
    }
    //Metodo Salir
    public void salir(View view) {
        Intent salir =new Intent(Intent.ACTION_MAIN);
        salir.addCategory(Intent.CATEGORY_HOME);
        salir.setFlags((Intent.FLAG_ACTIVITY_NEW_TASK));
        startActivity(salir);
    }
    public void Regresar(View view) {
        Intent regresar= new Intent(this, MainActivity.class);
        startActivity(regresar);
    }

    //Metodo boton siguiente ray ban
    public void btnrayban(View view) {
        Intent ray= new Intent(this,RayBan.class);
        startActivity(ray);
    }

    public void btncarrera(View view) {
        Intent carrera= new Intent(this,Carrera.class);
        startActivity(carrera);
    }

    public void btnlacoste(View view) {
        Intent lacoste= new Intent(this,LaCoste.class);
        startActivity(lacoste);
    }

    public void btngucci(View view) {
        Intent gucci= new Intent(this,Gucci.class);
        startActivity(gucci);
    }


}