package com.miguelcr.a01_listasimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listaComida;
    private String[] comidas = new String[6];
    private boolean[] rotations = {false,false,false,false,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. rescatar el componente ListView para gestionarlo
        listaComida = (ListView) findViewById(R.id.list_view_food);

        // 2. Obtener los datos que vamos a dibujar en la lista
        comidas[0] = "Salmorejo";
        comidas[1] = "Huevos rotos";
        comidas[2] = "Pepito de gambas";
        comidas[3] = "Superserranito";
        comidas[4] = "Chocos fritos";
        comidas[5] = "Gambas de Huerva";

        // 3. Creamos un Adapter que nos permita dibujar los elementos
        // de nuestro array en el ListView

        ArrayAdapter<String> adapterComidas = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,comidas);

        // 4. Conectar el Adapter con el ListView
        listaComida.setAdapter(adapterComidas);

        // Gestión del evento click sobre un elemento de la lista
        listaComida.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String elementoSeleccionado = comidas[position];

        Toast.makeText(this, "Seleccionado: "+elementoSeleccionado, Toast.LENGTH_LONG).show();

        if(rotations[position]) {
            view.animate().rotationY(360).setDuration(2000).start();
        } else  {
            view.animate().rotationY(-360).setDuration(2000).start();
        }

        rotations[position] = !rotations[position];

    }
}
