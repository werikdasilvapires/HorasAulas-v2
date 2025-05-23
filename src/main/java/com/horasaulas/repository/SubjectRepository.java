package com.horasaulas.repository;

import com.horasaulas.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositório para entidade Disciplina
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
