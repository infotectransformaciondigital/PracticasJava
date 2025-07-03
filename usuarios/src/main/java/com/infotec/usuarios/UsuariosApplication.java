package com.infotec.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotec.usuarios.model.Areas;
import com.infotec.usuarios.model.Usuario;

@SpringBootApplication
public class UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
	}

	public void metodo() {
		Usuario miPrimerUsuario = new Usuario();
		miPrimerUsuario.setNombre("Sandra");

		Areas miArea = new Areas();
		miArea.setId(1);
		miArea.setName("Contabilidad");

		Areas miArea2 = new Areas();
		miArea2.setId(2);
		miArea2.setName("Finanzas");

		
	}

}
