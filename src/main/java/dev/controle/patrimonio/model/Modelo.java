package dev.controle.patrimonio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Modelo extends EntidadeBase {

    private String nome;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;
}
