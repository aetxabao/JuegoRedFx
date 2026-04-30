package edu.masanz.da.juegored.model;

public class Sala {

    private String nombreSala;
    private int numeroJugadores;
    private boolean esPrivada;
    private String dificultad;
    private int ping;

    public Sala(String nombreSala, int numeroJugadores, boolean esPrivada, String dificultad, int ping) {
        this.nombreSala = nombreSala;
        this.numeroJugadores = numeroJugadores;
        this.esPrivada = esPrivada;
        this.dificultad = dificultad;
        this.ping = ping;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public boolean isEsPrivada() {
        return esPrivada;
    }

    public void setEsPrivada(boolean esPrivada) {
        this.esPrivada = esPrivada;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getPing() {
        return ping;
    }

    public void setPing(int ping) {
        this.ping = ping;
    }
}
