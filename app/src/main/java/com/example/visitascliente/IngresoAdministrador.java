package com.example.visitascliente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class IngresoAdministrador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_administrador);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menuacceso, menu);
        return true;
    }

    public void cargar(View v){
        Log.i( "===>" ,  "En el metodo cargar()");
        startActivity(new Intent(this,MenuAdministrador.class));
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_logadm:
                Log.i("===>","Dentro de LogAdmin!");
                startActivity(new Intent(this,IngresoAdministrador.class));
                return true;
            case R.id.menu_logvend:
                Log.i("===>","Dentro de LogVend!");
                startActivity(new Intent(this,IngresoVendedor.class));
                return true;
            case R.id.menu_salir:
                Log.i("===>","Dentro de Salir!");
                System.exit(0);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }



}
