package dev.controle.patrimonio.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoriaCadastroDto(
        @NotBlank
        @Size(max = 100)
        String nome
) {
}
