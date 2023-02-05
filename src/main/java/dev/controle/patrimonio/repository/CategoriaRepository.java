package dev.controle.patrimonio.repository;

import dev.controle.patrimonio.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}