package com.horasaulas.repository;

import com.horasaulas.model.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositório para entidade Turma
public interface ClassRepository extends JpaRepository<ClassEntity, Long> {
}
