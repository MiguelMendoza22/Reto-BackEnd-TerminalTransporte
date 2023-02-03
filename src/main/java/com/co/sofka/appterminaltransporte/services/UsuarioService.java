package com.co.sofka.appterminaltransporte.services;

import com.co.sofka.appterminaltransporte.models.Usuario;
import com.co.sofka.appterminaltransporte.models.Viaje;
import com.co.sofka.appterminaltransporte.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public List<Usuario> obtenerUsuario() {
        return usuariosRepository.getUsuarios();
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        Usuario nuevoUsuario = new Usuario(usuario.getNombre());
        this.usuariosRepository.agregarUsuario(nuevoUsuario);
        return nuevoUsuario;
    }


}
