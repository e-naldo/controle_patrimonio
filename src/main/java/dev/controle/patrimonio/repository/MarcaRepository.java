package dev.controle.patrimonio.repository;

import dev.controle.patrimonio.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}