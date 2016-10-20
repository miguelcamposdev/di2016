package com.miguelcr.a05_spinners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerDiasSemana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerDiasSemana = (Spinner) findViewById(R.id.spinner_dias_semana);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.weekdays_array, android.R.layout.simple_spinner_item);

        // en este caso de los Spinner hay que especificar el layout que se utilizará
        // para dibujar el Spinner desplegado
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Aplico el adaptador al spinnerDiasSemana
        spinnerDiasSemana.setAdapter(adapter);

        // Gestion del evento ItemSelected sobre el Spinner
        // Vamos a indicarle que lo vamos a gestionar en este Activity, por eso ponemos
        // como parámetro this.
        spinnerDiasSemana.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String[] diasSemana = getResources().getStringArray(R.array.weekdays_array);
        String diaSeleccionado = diasSemana[position];
        Toast.makeText(this, "Dia seleccionado: "+diaSeleccionado, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
