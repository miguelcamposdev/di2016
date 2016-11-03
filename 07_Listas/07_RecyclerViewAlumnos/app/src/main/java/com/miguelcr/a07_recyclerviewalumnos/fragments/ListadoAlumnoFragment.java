package com.miguelcr.a07_recyclerviewalumnos.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miguelcr.a07_recyclerviewalumnos.R;
import com.miguelcr.a07_recyclerviewalumnos.interfaces.IAlumnoClickListener;
import com.miguelcr.a07_recyclerviewalumnos.pojos.Alumno;

import java.util.ArrayList;
import java.util.List;

public class ListadoAlumnoFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private IAlumnoClickListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ListadoAlumnoFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ListadoAlumnoFragment newInstance(int columnCount) {
        ListadoAlumnoFragment fragment = new ListadoAlumnoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alumno_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

            List<Alumno> listadoAlumno = new ArrayList<>();
            listadoAlumno.add(new Alumno("https://pbs.twimg.com/profile_images/378800000705715000/6359097f8f7e91c476d1804b9446be26_400x400.png","Pepe",3));
            listadoAlumno.add(new Alumno("https://pbs.twimg.com/profile_images/718588760003383296/2AG8omMO_400x400.jpg","María",2));
            listadoAlumno.add(new Alumno("https://pbs.twimg.com/profile_images/2877768723/e32f9a8a76b9a41f89dce20832bf9b43_400x400.png","Juan",1));
            listadoAlumno.add(new Alumno("https://pbs.twimg.com/profile_images/378800000705715000/6359097f8f7e91c476d1804b9446be26_400x400.png","Pepe",3));
            listadoAlumno.add(new Alumno("https://pbs.twimg.com/profile_images/378800000705715000/6359097f8f7e91c476d1804b9446be26_400x400.png","Pepe",3));
            listadoAlumno.add(new Alumno("https://pbs.twimg.com/profile_images/378800000705715000/6359097f8f7e91c476d1804b9446be26_400x400.png","Pepe",3));
            listadoAlumno.add(new Alumno("https://pbs.twimg.com/profile_images/378800000705715000/6359097f8f7e91c476d1804b9446be26_400x400.png","Pepe",3));

            recyclerView.setAdapter(new MyAlumnoRecyclerViewAdapter(listadoAlumno, mListener, getActivity()));
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IAlumnoClickListener) {
            mListener = (IAlumnoClickListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " debes implementar en el Activity la interfaz IAlumnoClickListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
