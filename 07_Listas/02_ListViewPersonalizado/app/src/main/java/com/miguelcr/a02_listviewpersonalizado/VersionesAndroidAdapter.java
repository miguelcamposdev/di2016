package com.miguelcr.a02_listviewpersonalizado;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by miguelcampos on 21/10/16.
 */
public class VersionesAndroidAdapter extends ArrayAdapter<VersionesAndroid> {
    private Context ctx;
    private int layoutItem;
    private List<VersionesAndroid> values;

    public VersionesAndroidAdapter(Context context, int resource, List<VersionesAndroid> objects) {
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
        VersionesAndroid current = values.get(position);

        // 2. Obtener del layout todos los componentes visuales
        // que tengo que modificar
        ImageView iconoImageView = (ImageView)v.findViewById(R.id.imageViewIcono);
        TextView nombreTextView =  (TextView)v.findViewById(R.id.textViewNombre);

        // 3. Aplico los datos del listado sobre los componentes visuales
        iconoImageView.setImageResource(current.getIconoVersion());
        nombreTextView.setText(current.getNombreVersion());

        return v;
    }
}
