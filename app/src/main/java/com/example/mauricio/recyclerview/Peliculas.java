package com.example.mauricio.recyclerview;

/**
 * Created by MAURICIO on 27/01/2018.
 */

public class Peliculas {
    private int portadaPelicula;
    private String nombrePelicula;
    private String duracionPelicula;

    public int getPortadaPelicula() {
        return portadaPelicula;
    }
    public Peliculas(int portadaPelicula, String nombrePelicula, String duracionPelicula){
        this.portadaPelicula=portadaPelicula;
        this.nombrePelicula=nombrePelicula;
        this.duracionPelicula=duracionPelicula;
    }

    public void setPortadaPelicula(int portadaPelicula) {
        this.portadaPelicula = portadaPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(String duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

}
