package com.miguelcr.a08_repasorecyclerview.pojos;

/**
 * Created by miguelcampos on 7/11/16.
 */

public class Vuelo {
    Company airline;
    String horaSalida;
    String horaLlegada;
    String duracion;
    float valoracion;
    String origen;
    String destino;
    int numEscalas;
    float precio;

    public Vuelo() {
    }

    public Vuelo(Company airline, String horaSalida, String horaLlegada, String duracion, float valoracion, String origen, String destino, int numEscalas, float precio) {
        this.airline = airline;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.duracion = duracion;
        this.valoracion = valoracion;
        this.origen = origen;
        this.destino = destino;
        this.numEscalas = numEscalas;
        this.precio = precio;
    }

    public Company getAirline() {
        return airline;
    }

    public void setAirline(Company airline) {
        this.airline = airline;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumEscalas() {
        return numEscalas;
    }

    public void setNumEscalas(int numEscalas) {
        this.numEscalas = numEscalas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
