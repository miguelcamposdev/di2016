package com.miguelcr.a02_listviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listViewVersionesAndroid;
    private List<VersionesAndroid> versionesAndroidList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Paso 1
        listViewVersionesAndroid = (ListView) findViewById(R.id.list_view_android_versions);

        // Paso 2
        versionesAndroidList = new ArrayList<>();
        versionesAndroidList.add(new VersionesAndroid("Donut",R.drawable.ic_donut));
        versionesAndroidList.add(new VersionesAndroid("Cupcake",R.drawable.ic_cupcake));
        versionesAndroidList.add(new VersionesAndroid("Gingerbread",R.drawable.ic_gingerbread));
        versionesAndroidList.add(new VersionesAndroid("Ice-cream",R.drawable.ic_ice_cream));
        versionesAndroidList.add(new VersionesAndroid("Kitkat",R.drawable.ic_kitkat));
        versionesAndroidList.add(new VersionesAndroid("Lollipop",R.drawable.ic_lollipop));

        // Paso 3
        VersionesAndroidAdapter adapter = new VersionesAndroidAdapter(
                this,
                R.layout.version_android_item,
                versionesAndroidList
        );


        // Paso 4
        listViewVersionesAndroid.setAdapter(adapter);

        // ********** ATENCION *****************
        // La siguiente línea de código es la que indica que el evento
        // longClick sobre un item del ListView abrirá el menú contextual
        registerForContextMenu(listViewVersionesAndroid);


    }

    // Este método es el encargado de cargar como menú contextual el XML
    // que queramos
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        AdapterView.AdapterContextMenuInfo info =
                (AdapterView.AdapterContextMenuInfo) menuInfo;
        menu.setHeaderTitle(versionesAndroidList
                .get(info.position)
                .getNombreVersion());

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    // Este método gestiona los eventos click sobre una acción del menú
    // contextual

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch (item.getItemId()) {
            case R.id.action_edit:
                Toast.makeText(this, "Editar: "+versionesAndroidList.get(info.position).getNombreVersion(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_delete:
                Toast.makeText(this, "Eliminar: "+versionesAndroidList.get(info.position).getNombreVersion(), Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
