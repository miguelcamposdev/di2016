package com.miguelcr.a01_buttonclickeventlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttonClickHere);
        btn2 = (Button) findViewById(R.id.buttonClickThere);
    }

    @Override
    public void onClick(View button) {
        int id = button.getId();

        switch(id) {
            case R.id.buttonClickHere:
                // Botón 1
                break;
            case R.id.buttonClickThere:
                // Botón 2
                break;
        }

    }
}
