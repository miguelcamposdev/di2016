package com.miguelcr.a07_recyclerviewalumnos.pojos;

/**
 * Created by miguelcampos on 2/11/16.
 */
public class Alumno {
    private String urlFoto;
    private String nombre;
    private int numAsignaturas;

    public Alumno(String urlFoto, String nombre, int numAsignaturas) {
        this.urlFoto = urlFoto;
        this.nombre = nombre;
        this.numAsignaturas = numAsignaturas;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }
}
