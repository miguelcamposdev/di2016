package com.miguelcr.a07_recyclerviewalumnos.fragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.miguelcr.a07_recyclerviewalumnos.R;
import com.miguelcr.a07_recyclerviewalumnos.interfaces.IAlumnoClickListener;
import com.miguelcr.a07_recyclerviewalumnos.pojos.Alumno;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAlumnoRecyclerViewAdapter extends RecyclerView.Adapter<MyAlumnoRecyclerViewAdapter.ViewHolder> {

    private final Context ctx;
    private final List<Alumno> mValues;
    private final IAlumnoClickListener mListener;

    public MyAlumnoRecyclerViewAdapter(List<Alumno> items, IAlumnoClickListener listener, Context context) {
        mValues = items;
        mListener = listener;
        ctx = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_alumno_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textViewNombreAlumno.setText(holder.mItem.getNombre());
        holder.textViewNumeroAsignaturas.setText(holder.mItem.getNumAsignaturas());

        //TODO: setImage con Picasso
        Picasso.with(ctx).load(holder.mItem.getUrlFoto()).into(holder.imageViewPhotoAlumno);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onAlumnoClick(holder.mItem);
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
        public final ImageView imageViewPhotoAlumno;
        public final TextView textViewNombreAlumno;
        public final TextView textViewNumeroAsignaturas;
        public Alumno mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            imageViewPhotoAlumno = (ImageView) view.findViewById(R.id.image_view_photo_alumno);
            textViewNombreAlumno = (TextView) view.findViewById(R.id.text_view_nombre_alumno);
            textViewNumeroAsignaturas = (TextView) view.findViewById(R.id.text_view_numero_asignaturas);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mItem.getNombre() + "'";
        }
    }
}
