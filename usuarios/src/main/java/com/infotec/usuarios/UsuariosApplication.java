package com.infotec.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.infotec.usuarios.model.Usuario;


@SpringBootApplication
public class UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
	}

	public void metodoPrueba() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Sandra");
		usuario.setCorreo("sandra@correo.com");
		System.out.println(usuario.getNombre());
		System.out.println(usuario.toString());
		
	}

}
