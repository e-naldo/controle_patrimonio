package dev.controle.patrimonio.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CategoriaAlteracaoDto(
        @NotNull
        Long id,
        @NotBlank
        @Size(max = 100)
        String nome
) {
}
