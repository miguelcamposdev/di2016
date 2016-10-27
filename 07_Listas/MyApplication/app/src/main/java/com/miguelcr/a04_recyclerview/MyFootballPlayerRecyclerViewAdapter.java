package com.miguelcr.a04_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

// Dentro de este Adapter hay que modificar el código autogenerado en este orden:

// PASO 1.
// En el método 'onCreateViewHolder', asegurarnos que existe el layout del elemento de la
// lista. En este ejemplo: R.layout.fragment_footballplayer_item. MUY IMPORTANTE: por defecto
// el asistente de Android Studio de creación de un List Fragment, genera un layout que se
// llama R.layout.fragment_item al que debemos ponerle otro nombre y crearlo, ya que el asistente
// no lo crea. A continuación, entrar en el layout y diseñar cómo queremos que sea visualmente
// un elemento de nuestra lista.

// PASO 2.
// En la clase ViewHolder de este adaptador, debemos eliminar los elemenos de tipo View que aparecen
// por defecto como atributos de dicha clase y personalizarlo con los elementos visuales
// que hayamos diseñado en nuestro layout_item.xml. Por ejemplo si en el layout_item.xml
// tenemos 2 elementos TextView y 1 ImageView en el adaptador tendremos que tener
// el elemento "public final View mView;" que hace referencia al elemento raíz (RelativeLayout, LinearLayout, CardView,...),
// y además una propiedad para cada uno de los elementos visuales:
// public final TextView textView1;
// public final TextView textView2;
// public final TextView imageView1;
//
// El elemento mItem deberá ser del mismo tipo del POJO de elementos que recorremos
// en este caso FootballPlayer. Recomiendo hacer Refacto > Type migration... de DummyItem
// al tipo de objeto de nuestro POJO.
//
// En el momento en que declaremos esta propiedades aparecerá un warning, ya que dentro del
// constructor de la clase ViewHolder debemos instanciar los elementos visuales
// con la instrucción que más nos gusta a los Android Developers: findViewById
//
// public ViewHolder(View view) {
//      super(view);
//      mView = view;
//      textView1 = (TextView) view.findViewById(R.id.text_view_1);
//      textView2 = (TextView) view.findViewById(R.id.text_view_2);
//      imageView1 = (ImageView) view.findViewById(R.id.image_view_1);
// }
//

// PASO 3 (y último)
// en el método onBindViewHolder, debemos "setear" los datos del elemento que estamos
// recorriendo en ese momento sobre los componentes visuales
// El elemento actual o "current" lo tenemos definido en holder.mItem, donde holder
// es un objeto de ViewHolder que recibimos en el primer parámetro de este método
// y que contiene una referencia a cada componente visual. Por ejemplo:
// holder.textView1

public class MyFootballPlayerRecyclerViewAdapter extends RecyclerView.Adapter<MyFootballPlayerRecyclerViewAdapter.ViewHolder> {

    private final List<FootballPlayer> mValues;

    public MyFootballPlayerRecyclerViewAdapter(List<FootballPlayer> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_footballplayer_item, parent, false);
        return new ViewHolder(view);
    }

    // En este método se realiza el dibujo de los elementos del layout
    // con los datos del POJO FootballPLayer que tenemos definido en
    // ViewHolder > mItem
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        // guardamos en el elemento del ViewHolder > mItem
        // el elemento actual que estamos recorriendo >> mValues.get(position)
        holder.mItem = mValues.get(position);

        // Hacer un set de los elementos que queremos modificar de nuestra
        // vista con los datos del elemento actual
        holder.textViewNombreJugador.setText(holder.mItem.getNombre());
        holder.textViewEquipoFutbol.setText(holder.mItem.getEquipo());

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    // Definimos como si de un POJO se tratase, todos los componentes visuales
    // de un elemento de la lista, vamos a personalizar con los datos de cada
    // FootballPlayer. Si hubiera en el layout (fragment_footballplayer_item.xml) algún
    // elemento visual que no debiera ser personalizado, porque sea un elemento decorativo
    // no hay que declararlo en este ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView textViewNombreJugador;
        public final TextView textViewEquipoFutbol;
        public FootballPlayer mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            textViewNombreJugador = (TextView) view.findViewById(R.id.text_view_nombre);
            textViewEquipoFutbol = (TextView) view.findViewById(R.id.text_view_equipo);
        }
    }
}
