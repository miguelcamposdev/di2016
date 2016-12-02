package com.miguelcr.a02_tabsactivity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapaFragment extends Fragment {


    public MapaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mapa, container, false);

        // Si quiero ocultar en este fragment el FAB del MainActivity
        // tengo que invocar al método de la interfaz IFloatingActionButton
        // que oculta el FAB.


        return v;
    }
}
