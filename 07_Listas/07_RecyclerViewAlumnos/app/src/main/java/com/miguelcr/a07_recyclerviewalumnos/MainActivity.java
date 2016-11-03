package com.miguelcr.a07_recyclerviewalumnos;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.miguelcr.a07_recyclerviewalumnos.fragments.ListadoAlumnoFragment;
import com.miguelcr.a07_recyclerviewalumnos.interfaces.IAlumnoClickListener;
import com.miguelcr.a07_recyclerviewalumnos.pojos.Alumno;

public class MainActivity extends AppCompatActivity implements IAlumnoClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment f = new ListadoAlumnoFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, f)
                .commit();
    }

    @Override
    public void onAlumnoClick(Alumno a) {
        Intent i = new Intent(this, DetalleAlumnoScrollingActivity.class);

        i.putExtra(Constantes.EXTRA_NOMBRE_ALUMNO,a.getNombre());
        i.putExtra(Constantes.EXTRA_FOTO_ALUMNO,a.getUrlFoto());

        startActivity(i);
    }
}
