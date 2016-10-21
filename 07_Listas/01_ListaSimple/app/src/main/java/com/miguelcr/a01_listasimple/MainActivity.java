package com.miguelcr.a01_listasimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listaComida;
    private String[] comidas = new String[6];
    private int[] unidades = {0,0,0,0,0,0};
    private boolean[] rotations = {false,false,false,false,false,false};
    private ArrayAdapter<String> adapterComidas;

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

        adapterComidas = new ArrayAdapter<>(
                this, // Contexto > el Activity en el que me encuentro
                android.R.layout.simple_list_item_1, // layout con el que vamos a dibujar un elemento de la lista
                comidas // listado de datos que queremos dibujar en la lista
        );

        // 4. Conectar el Adapter con el ListView
        listaComida.setAdapter(adapterComidas);

        // Gestión del evento click sobre un elemento de la lista
        // Al decir this, estamos diciendo que el MainActivity implementa
        // la interfaz OnItemClickListener y por tanto está obligada a sobreescribir
        // el método onItemClick de dicha interfaz. Ese método será el que
        // ejecute cuando hagamos click en un elemento del ListView
        listaComida.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String elementoSeleccionado = comidas[position];
        TextView texto = (TextView) view;


        Toast.makeText(this, "Seleccionado: "+elementoSeleccionado, Toast.LENGTH_LONG).show();

        /*if(rotations[position]) {
            view.animate().rotationX(360).setDuration(2000).start();
        } else  {
            view.animate().rotationX(-360).setDuration(2000).start();
        }*/

        unidades[position]++;
        texto.setText(comidas[position]+" ( "+unidades[position]+" )");

        rotations[position] = !rotations[position];

    }



    public void resetListaComidas(View view) {
        // Reseteamos el número de unidades de todas las comidas a 0.
        for(int i=0; i<unidades.length; i++) {
            unidades[i] = 0;
        }

        // Tenemos que redibujar los elementos de la lista
        // haciendo uso del Adapter.
        adapterComidas.notifyDataSetChanged();
    }
}
