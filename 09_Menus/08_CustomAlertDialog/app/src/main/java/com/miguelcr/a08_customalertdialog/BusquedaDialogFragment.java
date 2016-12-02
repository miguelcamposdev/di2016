package com.miguelcr.a08_customalertdialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class BusquedaDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.dialog_busqueda, null);

        EditText texto = (EditText) v.findViewById(R.id.texto_busqueda);

        Button btn = (Button) v.findViewById(R.id.button_go);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Esta línea de código debe ejecutarse cuando haga click en un elemento
                // de la lista
                BusquedaDialogFragment.this.getDialog().cancel();
            }
        });

        builder.setView(v);
        builder.setMessage("Buscar una ciudad")
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Send the negative button event back to the host activity
                        dialog.dismiss();
                    }
                });

        return builder.create();
    }
}
