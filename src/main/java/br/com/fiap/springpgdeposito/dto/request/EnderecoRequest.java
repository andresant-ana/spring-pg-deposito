package br.com.fiap.springpgdeposito.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record EnderecoRequest(

        @NotNull(message = "O CEP deve ser informado")
        @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP inválido")
        String cep,
        String numero,
        String complemento

) {
}
