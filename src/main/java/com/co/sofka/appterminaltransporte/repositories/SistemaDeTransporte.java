package com.co.sofka.appterminaltransporte.repositories;

import com.co.sofka.appterminaltransporte.models.Autobus;
import com.co.sofka.appterminaltransporte.models.Destino;
import com.co.sofka.appterminaltransporte.models.Viaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class SistemaDeTransporte {

    public List<Autobus> autobusesList;
    public List<Destino> destinosList;
    public List<Viaje> viajeList;

    private int id = 1;

    public SistemaDeTransporte() {
        this.autobusesList = new ArrayList<>();
        this.destinosList = new ArrayList<>();
        this.viajeList = new ArrayList<>();
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

    public List<Autobus> getAutobuses() {
        this.autobusesConPuestosVacios();
        return autobusesList;
    }

    public void agregarDestino(Destino destino) {
        destino.setId(this.id);
        this.id++;
        destinosList.add(destino);
    }
    public Autobus buscarAutobusPorId(int id) {
        List<Autobus> autobuses = getAutobuses();
        return autobuses.stream().filter(autobus -> autobus.getId() == id).findFirst().orElse(null);
    }

    public void mostrarDestino() {
        destinosList.stream().forEach(destino -> System.out.println(destino.getNombre()));
    }

    public List<Destino> getDestinos() {
        this.mostrarDestino();
        return destinosList;
    }
    public Destino buscarDestinoPorId(int id) {
        List<Destino> destinos = getDestinos();
        return destinos.stream().filter(destino -> destino.getId() == id).findFirst().orElse(null);
    }



    public Viaje agregarViaje(Viaje viaje) {
        viaje.setId(this.id);
        this.id++;
        viajeList.add(viaje);
        return viaje;
    }

    public void mostrarViaje() {
        viajeList.stream().forEach(viaje -> System.out.println("Viaje a: " + viaje.getDestino() + " " + viaje.getHorario() + " " + viaje.getAutobus()));
    }

    public List<Viaje> getViajes() {
        this.mostrarViaje();
        return viajeList;
    }




}
