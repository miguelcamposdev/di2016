package com.miguelcr.a06_recyclerviewcondetalle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.miguelcr.a06_recyclerviewcondetalle.interfaces.IJugadorClickListener;
import com.miguelcr.a06_recyclerviewcondetalle.pojos.Jugador;

public class MainActivity extends AppCompatActivity implements IJugadorClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onJugadorClick(Jugador j) {
        Intent i = new Intent(this,DetalleJugadorActivity.class);
        i.putExtra("nombre",j.getNombre());
        startActivity(i);
    }
}
