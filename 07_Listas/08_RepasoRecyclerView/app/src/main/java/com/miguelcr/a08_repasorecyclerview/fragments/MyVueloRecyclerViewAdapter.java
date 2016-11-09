package com.miguelcr.a08_repasorecyclerview.fragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.miguelcr.a08_repasorecyclerview.R;
import com.miguelcr.a08_repasorecyclerview.fragments.ItemFragment.OnListFragmentInteractionListener;
import com.miguelcr.a08_repasorecyclerview.fragments.dummy.DummyContent.DummyItem;
import com.miguelcr.a08_repasorecyclerview.pojos.Vuelo;

import java.util.List;

public class MyVueloRecyclerViewAdapter extends RecyclerView.Adapter<MyVueloRecyclerViewAdapter.ViewHolder> {

    private final List<Vuelo> mValues;
    private final OnListFragmentInteractionListener mListener;
    private final Context ctx;

    public MyVueloRecyclerViewAdapter(List<Vuelo> items, OnListFragmentInteractionListener listener, Context context) {
        mValues = items;
        mListener = listener;
        ctx = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // En fragment_vuelo_item diseñamos la plantilla para dibujar
        // un objeto de tipo Vuelo
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_vuelo_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

        holder.imageViewLogo.setImageResource(holder.mItem.getAirline().getLogo());
        holder.textViewHora.setText(holder.mItem.getHoraSalida()+" - "+holder.mItem.getHoraLlegada());
        holder.textViewVuelo.setText(holder.mItem.getOrigen()+" - "+holder.mItem.getDestino()+", "+holder.mItem.getAirline().getNombre());
        holder.textViewDuracion.setText(holder.mItem.getDuracion());

        if(holder.mItem.getNumEscalas()==0) {
            holder.textViewEscalas.setText(ctx.getString(R.string.escalas_directo));
        } else if(holder.mItem.getNumEscalas()==1){
            holder.textViewEscalas.setText(holder.mItem.getNumEscalas()+" "+ctx.getString(R.string.escala));
        } else {
            holder.textViewEscalas.setText(holder.mItem.getNumEscalas()+" "+ctx.getString(R.string.escalas));
        }

        holder.textViewValoracion.setText(String.valueOf(holder.mItem.getValoracion()));
        holder.textViewTextoValoracion.setText("El más barato");
        holder.textViewPrecio.setText(holder.mItem.getPrecio()+ctx.getString(R.string.currency));
        holder.textViewAirline.setText("a través de "+holder.mItem.getAirline().getNombre());

        holder.textViewVuelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
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
        public final ImageView imageViewLogo;
        public final TextView textViewHora;
        public final TextView textViewVuelo;
        public final TextView textViewDuracion;
        public final TextView textViewEscalas;
        public final TextView textViewValoracion;
        public final TextView textViewTextoValoracion;
        public final TextView textViewPrecio;
        public final TextView textViewAirline;
        public Vuelo mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            imageViewLogo = (ImageView) view.findViewById(R.id.image_view_logo);
            textViewHora = (TextView) view.findViewById(R.id.text_view_hora);
            textViewVuelo = (TextView) view.findViewById(R.id.text_view_vuelo);

            textViewDuracion = (TextView) view.findViewById(R.id.text_view_duracion);
            textViewEscalas = (TextView) view.findViewById(R.id.text_view_escalas);
            textViewValoracion = (TextView) view.findViewById(R.id.text_view_valoracion);
            textViewTextoValoracion = (TextView) view.findViewById(R.id.text_view_valoracion_texto);
            textViewPrecio = (TextView) view.findViewById(R.id.text_view_precio);
            textViewAirline = (TextView) view.findViewById(R.id.text_view_airline_travel);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewVuelo.getText() + "'";
        }
    }
}
