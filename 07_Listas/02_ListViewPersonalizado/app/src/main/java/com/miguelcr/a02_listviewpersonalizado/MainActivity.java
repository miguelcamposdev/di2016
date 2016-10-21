package com.miguelcr.a02_listviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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


    }
}
