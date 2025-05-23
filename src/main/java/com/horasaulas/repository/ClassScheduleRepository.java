package com.horasaulas.repository;

import com.horasaulas.model.ClassSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositório para entidade Horário de Aula
public interface ClassScheduleRepository extends JpaRepository<ClassSchedule, Long> {
}
