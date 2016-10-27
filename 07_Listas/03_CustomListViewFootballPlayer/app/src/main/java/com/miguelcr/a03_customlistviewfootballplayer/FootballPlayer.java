package com.miguelcr.a03_customlistviewfootballplayer;

/**
 * Created by miguelcampos on 24/10/16.
 */

public class FootballPlayer {
    private String nombreJugador;
    private float rate;

    public FootballPlayer(float rate, String nombreJugador) {
        this.rate = rate;
        this.nombreJugador = nombreJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
