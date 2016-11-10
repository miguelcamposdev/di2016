package com.miguelcr.a09_examencursoanterior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements InterfaceEmailListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFavoritoClickListener(EmailItem emailItem) {
        Toast.makeText(this, "Email de:"+emailItem.getRemitente()+" favorito", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRemitenteClickListener(EmailItem emailItem) {

    }
}
