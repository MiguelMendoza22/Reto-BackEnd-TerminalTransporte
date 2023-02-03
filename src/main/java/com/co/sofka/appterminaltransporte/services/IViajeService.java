package com.co.sofka.appterminaltransporte.services;

import com.co.sofka.appterminaltransporte.models.Autobus;
import com.co.sofka.appterminaltransporte.models.Destino;
import com.co.sofka.appterminaltransporte.models.Viaje;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface IViajeService {

    List<Destino> obtenerDestino();
    Destino registrarDestino(Destino destino);

    List<Autobus> obtenerAutobusesDisponibles();
    Autobus registrarAutobus(Autobus autobus);

    List<Viaje> obtenerViaje();
    Viaje registrarViaje(Viaje viaje);
}
