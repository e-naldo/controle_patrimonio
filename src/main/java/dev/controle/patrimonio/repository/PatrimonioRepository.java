package dev.controle.patrimonio.repository;

import dev.controle.patrimonio.model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long> {
}