package com.miguelcr.a06_recyclerviewcondetalle;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.miguelcr.a06_recyclerviewcondetalle.interfaces.IJugadorClickListener;
import com.miguelcr.a06_recyclerviewcondetalle.pojos.Jugador;

import java.util.List;


public class MyJugadorRecyclerViewAdapter extends RecyclerView.Adapter<MyJugadorRecyclerViewAdapter.ViewHolder> {

    private final List<Jugador> mValues;
    private final IJugadorClickListener mListener;

    public MyJugadorRecyclerViewAdapter(List<Jugador> items, IJugadorClickListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_jugador, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textViewNombreJugador.setText(mValues.get(position).getNombre());
        holder.textViewNombreEquipo.setText(mValues.get(position).getEquipo());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onJugadorClick(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView textViewNombreJugador;
        public final TextView textViewNombreEquipo;
        public Jugador mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            textViewNombreJugador = (TextView) view.findViewById(R.id.id);
            textViewNombreEquipo = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewNombreEquipo.getText() + "'";
        }
    }
}
