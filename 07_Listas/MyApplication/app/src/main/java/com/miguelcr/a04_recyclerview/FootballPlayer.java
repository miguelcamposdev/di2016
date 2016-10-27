package com.miguelcr.a04_recyclerview;

/**
 * Created by miguelcampos on 27/10/16.
 */

public class FootballPlayer {
    private String nombre, equipo;

    public FootballPlayer(String nombre, String equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
