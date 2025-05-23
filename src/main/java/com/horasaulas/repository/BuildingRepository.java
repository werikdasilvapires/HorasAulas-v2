package com.horasaulas.repository;

import com.horasaulas.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositório para entidade Prédio
public interface BuildingRepository extends JpaRepository<Building, Long> {
}
