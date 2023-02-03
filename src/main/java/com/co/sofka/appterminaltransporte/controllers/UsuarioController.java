package com.co.sofka.appterminaltransporte.controllers;

import com.co.sofka.appterminaltransporte.models.Autobus;
import com.co.sofka.appterminaltransporte.models.Usuario;
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

    @GetMapping("/mostrarusuarios")
    public ResponseEntity mostrarUsuarios() {
        return new ResponseEntity(usuarioService.obtenerUsuario(), HttpStatus.FOUND);
    }

    @PostMapping("/registrarusuarios")
    public ResponseEntity registrarUsuarios(@RequestBody Usuario usuario) {
        return new ResponseEntity(usuarioService.registrarUsuario(usuario), HttpStatus.CREATED);
    }
}
