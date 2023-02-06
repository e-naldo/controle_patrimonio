package dev.controle.patrimonio.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Categoria extends EntidadeBase {

    private String nome;

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria(Long id, String nome) {
        super(id);
        this.nome = nome;
    }
}
