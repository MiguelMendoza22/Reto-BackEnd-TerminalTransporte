package com.co.sofka.appterminaltransporte.services;

import com.co.sofka.appterminaltransporte.models.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> obtenerUsuario();
    Usuario registrarUsuario(Usuario usuario);
}
