package com.horasaulas.repository;

import com.horasaulas.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositório para entidade Professor
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
