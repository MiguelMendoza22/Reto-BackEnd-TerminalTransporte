package com.co.sofka.appterminaltransporte.controllers;

import com.co.sofka.appterminaltransporte.models.Autobus;
import com.co.sofka.appterminaltransporte.models.Usuario;
import com.co.sofka.appterminaltransporte.models.Viaje;
import com.co.sofka.appterminaltransporte.repositories.SistemaDeTransporte;
import com.co.sofka.appterminaltransporte.repositories.UsuariosRepository;
import com.co.sofka.appterminaltransporte.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;
    private UsuariosRepository repository;
    private SistemaDeTransporte repositorio;

    public UsuarioController(UsuariosRepository repository, SistemaDeTransporte repositorio) {
        this.repository = repository;
        this.repositorio = repositorio;
    }

    @GetMapping("/mostrarusuarios")
    public ResponseEntity mostrarUsuarios() {
        return new ResponseEntity(usuarioService.obtenerUsuario(), HttpStatus.FOUND);
    }

    @PostMapping("/registrarusuarios")
    public ResponseEntity registrarUsuarios(@RequestBody Usuario usuario) {
        return new ResponseEntity(usuarioService.registrarUsuario(usuario), HttpStatus.CREATED);
    }

    @PostMapping("/usuariosporviajes/{idViaje}")
    public ResponseEntity usuariosViaje(@PathVariable("idViaje") int idViaje, @RequestBody Usuario usuario) {
        Viaje viaje = this.repositorio.ingresarUsuario(idViaje,usuario);
        return new ResponseEntity(viaje,HttpStatus.FOUND);
    }

}
