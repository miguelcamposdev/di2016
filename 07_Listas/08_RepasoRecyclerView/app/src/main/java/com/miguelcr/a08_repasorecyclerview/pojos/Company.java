package com.miguelcr.a08_repasorecyclerview.pojos;

/**
 * Created by miguelcampos on 7/11/16.
 */
public class Company {
    int logo;
    String nombre;

    public Company() {
    }

    public Company(int logo, String nombre) {
        this.logo = logo;
        this.nombre = nombre;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
