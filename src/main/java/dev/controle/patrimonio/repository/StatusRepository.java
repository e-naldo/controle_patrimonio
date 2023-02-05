package dev.controle.patrimonio.repository;

import dev.controle.patrimonio.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}