package com.miguelcr.a07_recyclerviewalumnos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetalleAlumnoScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_alumno_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Rescatamos los parámetros del Intent
        Bundle extras = getIntent().getExtras();
        String nombreAlumno = extras.getString(Constantes.EXTRA_NOMBRE_ALUMNO);
        String urlFoto = extras.getString(Constantes.EXTRA_FOTO_ALUMNO);

        // setText de los parámetros que recibo
        setTitle(nombreAlumno);
    }
}
