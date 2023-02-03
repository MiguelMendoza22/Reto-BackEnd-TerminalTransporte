package com.co.sofka.appterminaltransporte.models;

public class Usuario extends Persona{
    private int id;

    public Usuario() {
    }

    public Usuario(String nombre) {
        super(nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
