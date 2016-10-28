package com.miguelcr.a06_recyclerviewcondetalle.pojos;

/**
 * Created by miguelcampos on 28/10/16.
 */

public class Jugador {
    private String nombre;
    private String equipo;

    public Jugador(String nombre, String equipo) {
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
