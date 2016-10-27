package com.miguelcr.a03_customlistviewfootballplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<FootballPlayer> footballPlayerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.list_view_jugadores);

        footballPlayerList = new ArrayList<>();
        footballPlayerList.add(new FootballPlayer(3.5f,"Ronaldo"));
        // footballPlayerList.add(new FootballPlayer(2.0f,"Pepito"));
        // footballPlayerList.add(new FootballPlayer(1.5f,"Raúl"));
        // footballPlayerList.add(new FootballPlayer(3.5f,"Ronaldo"));

        FootballPlayerAdapter adapter = new FootballPlayerAdapter(
                this,
                R.layout.football_player_item,
                footballPlayerList
        );

        lista.setAdapter(adapter);


    }
}
