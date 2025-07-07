package com.infotec.usuarios.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@ToString
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nombre")
    private String nombre;

    private String correo;
}

