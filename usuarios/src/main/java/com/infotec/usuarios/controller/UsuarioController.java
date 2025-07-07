package com.infotec.usuarios.controller;

import com.infotec.usuarios.model.Usuario;
import com.infotec.usuarios.repository.UsuarioRepository;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Obtener todos los usuarios
    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    // Obtener un usuario por ID
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    // Crear nuevo usuario
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Actualizar usuario
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        Usuario existente = usuarioRepository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(usuario.getNombre());
            existente.setCorreo(usuario.getCorreo());
            return usuarioRepository.save(existente);
        } else {
            return null;
        }
    }

    // Eliminar usuario
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Integer id) {
        usuarioRepository.deleteById(id);
    }
}

