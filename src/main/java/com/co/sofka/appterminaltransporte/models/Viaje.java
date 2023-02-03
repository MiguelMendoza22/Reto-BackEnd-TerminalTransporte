package com.co.sofka.appterminaltransporte.models;

public class Viaje {
    private int id;
    private String horario;
    private Autobus autobus;
    private Destino destino;

    public Viaje() {
    }

    public Viaje(String horario, Autobus autobus, Destino destino) {
        this.horario = horario;
        this.autobus = autobus;
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
}
