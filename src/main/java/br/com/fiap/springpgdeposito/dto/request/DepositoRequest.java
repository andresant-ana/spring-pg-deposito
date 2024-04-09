package br.com.fiap.springpgdeposito.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DepositoRequest(

        @NotNull(message = "Nome é obrigatório")
        String nome,

        @NotNull(message = "Endereço é obrigatório")
        EnderecoRequest endereco


) {
}
