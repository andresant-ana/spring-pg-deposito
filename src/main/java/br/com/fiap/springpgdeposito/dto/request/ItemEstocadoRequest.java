package br.com.fiap.springpgdeposito.dto.request;

import br.com.fiap.springpgdeposito.dto.AbstractDTO;
import jakarta.validation.constraints.NotNull;

public record ItemEstocadoRequest(

        @NotNull(message = "O produto deve ser informado")
        AbstractDTO produto,

        @NotNull(message = "O depósito deve ser informado")
        AbstractDTO deposito

) {
}
