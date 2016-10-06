package com.miguelcr.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radio_group_videogames);
    }

    public void onVideogamesAnswerClicked(View view) {
        //RadioButton radioButtonSelected = (RadioButton)view;
        int idRadioButtonSeleccionado = view.getId();
        mostrarMensaje(idRadioButtonSeleccionado);
    }

    private void mostrarMensaje(int idRadioButtonSeleccionado) {
        switch (idRadioButtonSeleccionado) {
            case R.id.videogames_yes:
                Toast.makeText(this, R.string.message_friki, Toast.LENGTH_SHORT).show();
                break;
            case R.id.videogames_no:
                Toast.makeText(this, R.string.message_no_friki, Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void sendForm(View view) {
        // en este caso el objeto view que recibo es el Button sobre
        // el que se ha hecho click

        int idRadioButtonSeleccionado = radioGroup.getCheckedRadioButtonId();
        mostrarMensaje(idRadioButtonSeleccionado);
        // idVideogames = 1
    }
}
