package com.co.sofka.appterminaltransporte.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Autobus {
    private int id;
    private String marca;
    private String modelo;
    private int capacidad;
    private List<Persona> usuarios;

    public Autobus() {
        this.usuarios = new ArrayList<>();
    }

    public Autobus(String marca, String modelo, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void ingresarUsuario(Persona persona) {

    }

}
