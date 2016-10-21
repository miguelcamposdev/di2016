package com.miguelcr.a02_listviewpersonalizado;

/**
 * Created by miguelcampos on 21/10/16.
 */

public class VersionesAndroid {
    private String nombreVersion;
    private int iconoVersion;

    public VersionesAndroid(String nombreVersion, int iconoVersion) {
        this.nombreVersion = nombreVersion;
        this.iconoVersion = iconoVersion;
    }

    public String getNombreVersion() {
        return nombreVersion;
    }

    public void setNombreVersion(String nombreVersion) {
        this.nombreVersion = nombreVersion;
    }

    public int getIconoVersion() {
        return iconoVersion;
    }

    public void setIconoVersion(int iconoVersion) {
        this.iconoVersion = iconoVersion;
    }

    @Override
    public String toString() {
        return "VersionesAndroid{" +
                "nombreVersion='" + nombreVersion + '\'' +
                ", iconoVersion=" + iconoVersion +
                '}';
    }
}
