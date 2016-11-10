package com.miguelcr.a09_examencursoanterior;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class MyEmailItemRecyclerViewAdapter extends RecyclerView.Adapter<MyEmailItemRecyclerViewAdapter.ViewHolder> {

    private Context ctx;
    private final List<EmailItem> mValues;
    private final InterfaceEmailListener mListener;
    private final int[] colores = {R.color.color1,R.color.color2,R.color.color3,R.color.color4};

    public MyEmailItemRecyclerViewAdapter(List<EmailItem> items, InterfaceEmailListener listener, Context context) {
        mValues = items;
        mListener = listener;
        ctx = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_email_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textViewRemitente.setText(mValues.get(position).getRemitente());
        holder.textViewMensaje.setText(mValues.get(position).getMensaje());
        holder.textViewInicial.setText(String.valueOf(mValues.get(position).getRemitente().charAt(0)));

        if(holder.mItem.isFavorito()) {
            holder.imageViewFavorito.setImageResource(android.R.drawable.star_on);
        }

        int posicionColor = position%colores.length;
        holder.textViewInicial.setBackgroundColor(ContextCompat.getColor(ctx,colores[posicionColor]));

        holder.imageViewFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    holder.imageViewFavorito.setImageResource(android.R.drawable.star_on);
                    mListener.onFavoritoClickListener(holder.mItem);
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
        public final TextView textViewRemitente;
        public final TextView textViewMensaje;
        public final TextView textViewInicial;
        public final ImageView imageViewFavorito;

        public EmailItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            textViewRemitente = (TextView) view.findViewById(R.id.text_view_remitente);
            textViewMensaje = (TextView) view.findViewById(R.id.text_view_mensaje);
            textViewInicial = (TextView) view.findViewById(R.id.text_view_inicial);
            imageViewFavorito = (ImageView) view.findViewById(R.id.image_view_favorito);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewMensaje.getText() + "'";
        }
    }
}
