package com.co.sofka.appterminaltransporte.services;

import com.co.sofka.appterminaltransporte.models.Autobus;
import com.co.sofka.appterminaltransporte.models.Destino;
import com.co.sofka.appterminaltransporte.repositories.SistemaDeTransporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeService implements IViajeService {

    @Autowired
    private SistemaDeTransporte sistemaDeTransporte;

    @Override
    public List<Destino> obtenerDestino() {
        return sistemaDeTransporte.getDestinos();
    }
    @Override
    public Destino registrarDestino(Destino destino) {
        Destino nuevoDestino = new Destino(destino.getNombre());
        this.sistemaDeTransporte.agregarDestino(nuevoDestino);
        return nuevoDestino;
    }


    @Override
    public List<Autobus> obtenerAutobusesDisponibles() {
        return sistemaDeTransporte.getAutobuses();
    }

    @Override
    public Autobus registrarAutobus(Autobus autobus) {
        Autobus autobusNuevo = new Autobus(autobus.getMarca(), autobus.getModelo(), autobus.getCapacidad());
         this.sistemaDeTransporte.agregarAutobus(autobusNuevo);
        return autobusNuevo;
    }
}
