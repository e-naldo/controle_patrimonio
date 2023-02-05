package dev.controle.patrimonio.repository;

import dev.controle.patrimonio.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}