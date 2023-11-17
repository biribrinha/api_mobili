package com.senai.Mobili.repositories;

import com.senai.Mobili.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
    UsuarioModel findByEmail(String email);
}
