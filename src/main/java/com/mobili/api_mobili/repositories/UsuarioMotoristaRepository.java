package com.mobili.api_mobili.repositories;

import com.mobili.api_mobili.models.UsuarioMotoristaModel;


import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
    UsuarioModel findByEmail(String email);
}