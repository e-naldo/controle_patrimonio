package dev.controle.patrimonio.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Localizacao extends EntidadeBase {

    private String nome;
    private String responsavel;
    private String telefone;
    private String email;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf_estado;
    private String cep;
}
