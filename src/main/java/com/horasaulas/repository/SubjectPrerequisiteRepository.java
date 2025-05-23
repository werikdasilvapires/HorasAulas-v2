package com.horasaulas.repository;

import com.horasaulas.model.SubjectPrerequisite;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositório para entidade Pré-requisito de Disciplina
public interface SubjectPrerequisiteRepository extends JpaRepository<SubjectPrerequisite, Long> {
}
