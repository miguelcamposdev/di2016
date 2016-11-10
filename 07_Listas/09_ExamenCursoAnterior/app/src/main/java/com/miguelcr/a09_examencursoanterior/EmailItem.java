package com.miguelcr.a09_examencursoanterior;

/**
 * Created by miguelcampos on 10/11/16.
 */

public class EmailItem {
    private String remitente;
    private String mensaje;
    boolean favorito;

    public EmailItem(String remitente, String mensaje, boolean favorito) {
        this.remitente = remitente;
        this.mensaje = mensaje;
        this.favorito = favorito;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
}
