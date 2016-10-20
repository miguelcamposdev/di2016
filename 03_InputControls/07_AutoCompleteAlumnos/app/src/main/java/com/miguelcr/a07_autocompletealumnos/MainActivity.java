package com.miguelcr.a07_autocompletealumnos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (AutoCompleteTextView) findViewById(R.id.autocomplete_students);

        String[] alumnos = getResources().getStringArray(R.array.students_array);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alumnos);
        textView.setAdapter(adapter);
    }
}
