package com.infotec.usuarios.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "credenciales")
@Getter
@Setter
@ToString
public class Credencial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_credencial")
    private Integer idCredencial;

    private String username;

    @Column(name = "password_hash")
    private String passwordHash;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
