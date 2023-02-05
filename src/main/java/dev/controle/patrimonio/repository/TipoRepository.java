package dev.controle.patrimonio.repository;

import dev.controle.patrimonio.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo, Long> {
}