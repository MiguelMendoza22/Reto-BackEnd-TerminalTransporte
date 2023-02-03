package com.co.sofka.appterminaltransporte.repositories;

import com.co.sofka.appterminaltransporte.models.Autobus;
import com.co.sofka.appterminaltransporte.models.Usuario;
import com.co.sofka.appterminaltransporte.models.Viaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UsuariosRepository {
    public List<Usuario> usuarioList;

    private int id = 1;

    public UsuariosRepository() {
        this.usuarioList = new ArrayList<>();
    }
    public void agregarUsuario(Usuario usuario) {
        usuario.setId(this.id);
        id++;
        usuarioList.add(usuario);
    }

    public void mostrarUsuario() {
        usuarioList.stream().forEach(usuario -> System.out.println(usuario.getNombre()));
    }

    public List<Usuario> getUsuarios() {
        this.mostrarUsuario();
        return usuarioList;
    }


}
