package com.horasaulas.repository;

import com.horasaulas.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositório para entidade Departamento
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
