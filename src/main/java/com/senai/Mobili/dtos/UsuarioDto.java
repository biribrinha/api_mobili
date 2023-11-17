package com.senai.Mobili.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(
        @NotBlank String nome,
        @NotBlank @Email(message = "O email é invalido") String email,
        @NotBlank String senha,
        @NotBlank String telefone
) {

}
