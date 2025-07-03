package com.infotec.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infotec.usuarios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
