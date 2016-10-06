package com.miguelcr.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup, radioGroupFifa;
    TextView textViewQuestionFifa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radio_group_videogames);
        radioGroupFifa = (RadioGroup) findViewById(R.id.radio_group_fifa);
        textViewQuestionFifa = (TextView) findViewById(R.id.question_fifa);
    }

    public void onVideogamesAnswerClicked(View view) {
        //RadioButton radioButtonSelected = (RadioButton)view;
        int idRadioButtonSeleccionado = view.getId();
        switch (idRadioButtonSeleccionado) {

            case R.id.videogames_yes:
                Toast.makeText(this, R.string.message_friki, Toast.LENGTH_SHORT).show();
                textViewQuestionFifa.setVisibility(View.VISIBLE);
                radioGroupFifa.setVisibility(View.VISIBLE);
                break;
            case R.id.videogames_no:
                Toast.makeText(this, R.string.message_no_friki, Toast.LENGTH_SHORT).show();
                textViewQuestionFifa.setVisibility(View.GONE);
                radioGroupFifa.setVisibility(View.GONE);
                break;
        }
    }

}
