package dev.controle.patrimonio.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Categoria extends EntidadeBase {

    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria(Long id, String nome) {
        super();
    }
}
