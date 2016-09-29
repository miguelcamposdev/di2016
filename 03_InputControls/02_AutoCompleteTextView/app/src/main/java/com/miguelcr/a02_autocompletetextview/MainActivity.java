package com.miguelcr.a02_autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autocompletado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. objeto de nuestra IU de tipo AutoCompleteTextView
        autocompletado = (AutoCompleteTextView)findViewById(R.id.autocomplete_paises);

        // 2. Array de datos, definido en este caso en

        String[] paises = getResources().getStringArray(R.array.array_paises);

        ArrayAdapter<String> adapterPaises = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,paises);

        autocompletado.setAdapter(adapterPaises);

    }
}
