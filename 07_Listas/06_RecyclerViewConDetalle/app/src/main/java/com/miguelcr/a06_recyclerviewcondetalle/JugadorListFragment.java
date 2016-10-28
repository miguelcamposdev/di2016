package com.miguelcr.a06_recyclerviewcondetalle;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miguelcr.a06_recyclerviewcondetalle.interfaces.IJugadorClickListener;
import com.miguelcr.a06_recyclerviewcondetalle.pojos.Jugador;

import java.util.ArrayList;
import java.util.List;

public class JugadorListFragment extends Fragment {

    // TODO: Customize parameters
    private int mColumnCount = 1;

    private IJugadorClickListener mListener;
    private List<Jugador> jugadores;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public JugadorListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jugador_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

            jugadores = new ArrayList<>();
            jugadores.add(new Jugador("Ronaldo","Real Madrid"));

            recyclerView.setAdapter(new MyJugadorRecyclerViewAdapter(jugadores, mListener));
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IJugadorClickListener) {
            mListener = (IJugadorClickListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " debes implementar IJugadorClickListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
