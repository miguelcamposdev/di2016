package com.miguelcr.a07_recyclerviewalumnos;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.miguelcr.a07_recyclerviewalumnos.fragments.ListadoAlumnoFragment;

public class MainActivity extends AppCompatActivity {

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
}
