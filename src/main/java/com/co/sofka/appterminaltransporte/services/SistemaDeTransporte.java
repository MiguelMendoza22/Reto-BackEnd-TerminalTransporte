package com.co.sofka.appterminaltransporte.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class SistemaDeTransporte {

    public List<Autobus> autobusesList;
    public List<Destino> destinosList;

    private int id = 1;

    public SistemaDeTransporte() {
        this.autobusesList = new ArrayList<>();
        this.destinosList = new ArrayList<>();
    }

    public void agregarAutobus(Autobus autobus) {
        autobus.setId(this.id);
        this.id++;
        autobusesList.add(autobus);
    }

    public void autobusesConPuestosVacios() {
        AtomicInteger indice = new AtomicInteger(1);
        autobusesList.stream().filter(autobus -> autobus.getCapacidad() > 0)
                .forEach(autobus -> System.out.println(indice.getAndIncrement() + ". " + autobus.getMarca() + " "+ autobus.getModelo()
                        + " - puestos disponibles: " + autobus.getCapacidad()));
    }

    public void agregarDestino(Destino destino) {
        destino.setId(this.id);
        this.id++;
        destinosList.add(destino);
    }
}
