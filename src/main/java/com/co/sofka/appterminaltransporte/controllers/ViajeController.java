package com.co.sofka.appterminaltransporte.controllers;

import com.co.sofka.appterminaltransporte.models.Autobus;
import com.co.sofka.appterminaltransporte.services.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/viaje")
public class ViajeController {
    @Autowired
    private IViajeService viajeService;

    @GetMapping("/mostrarbuses")
    public ResponseEntity mostrarBuses() {
        return new ResponseEntity(viajeService.obtenerAutobusesDisponibles(), HttpStatus.FOUND);
    }


    @PostMapping("/registrarautobus")
    public ResponseEntity registrarAutobus(@RequestBody Autobus autobus) {
        return new ResponseEntity(viajeService.registrarAutobus(autobus), HttpStatus.CREATED);
    }


}
