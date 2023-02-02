package com.co.sofka.appterminaltransporte.services;

public class Autobus {
    private int id;
    private String marca;
    private String modelo;
    private int capacidad;

    public Autobus(int id, String marca, String modelo, int capacidad) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
