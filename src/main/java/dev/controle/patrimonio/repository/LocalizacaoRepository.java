package dev.controle.patrimonio.repository;

import dev.controle.patrimonio.model.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
}