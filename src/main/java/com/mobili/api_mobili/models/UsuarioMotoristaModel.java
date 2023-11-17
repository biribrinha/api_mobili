package com.mobili.api_mobili.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.io.Serial;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuarioMotorista")
public class UsuarioMotoristaModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuarioMotorista", nullable = false)

    private UUID id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String idade;
    private String id_categoria;
}