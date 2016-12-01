package com.miguelcr.a02_tabsactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoUsuariosFragment extends Fragment {


    public ListadoUsuariosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_listado_usuarios, container, false);

        // Mostrar FAB
        IFloatingActionButton mListener = (IFloatingActionButton) getActivity();
        mListener.mostrarOcultarFab(true);

        return v;
    }

}
