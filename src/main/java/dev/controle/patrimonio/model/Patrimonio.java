package dev.controle.patrimonio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patrimonio extends EntidadeBase {

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "localizacao_id")
    private Localizacao localizacao;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    private BigDecimal valor;

    @Column(name = "numero_serie")
    private String numeroSerie;

    @Column(name = "data_fabricacao")
    private LocalDate dataFabricacao;

    @Column(name = "data_compra")
    private LocalDate dataCompra;

    @Column(name = "nota_fiscal")
    private Integer notaFiscal;

    @Column(name = "data_fim_garantia")
    private LocalDate dataFimGarantia;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

    @Column(name = "data_alteracao")
    private LocalDate dataAlteracao;

    private String observacao;
}
