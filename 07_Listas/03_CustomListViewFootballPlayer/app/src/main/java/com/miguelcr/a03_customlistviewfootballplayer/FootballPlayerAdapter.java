package com.miguelcr.a03_customlistviewfootballplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by miguelcampos on 24/10/16.
 */
public class FootballPlayerAdapter extends ArrayAdapter {
    Context ctx;
    int layoutItem;
    List<FootballPlayer> values;


    public FootballPlayerAdapter(Context context, int resource, List<FootballPlayer> objects) {
        super(context, resource, objects);
        ctx = context;
        layoutItem = resource;
        values = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(ctx).inflate(layoutItem, parent, false);

        // 1. Rescato el elemento actual que estoy dibujando
        // mediante el parámetro position que recibo en este método
        FootballPlayer current = values.get(position);

        // 2. Obtener del layout todos los componentes visuales
        // que tengo que modificar
        TextView nombreJugadorTextView =  (TextView)v.findViewById(R.id.text_view_nombre_jugador);

        // 3. Aplico los datos del listado sobre los componentes visuales
        nombreJugadorTextView.setText(current.getNombreJugador());

        return v;
    }
}
