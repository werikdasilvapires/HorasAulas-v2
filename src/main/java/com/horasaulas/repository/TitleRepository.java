package com.horasaulas.repository;

import com.horasaulas.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositório para entidade Título
public interface TitleRepository extends JpaRepository<Title, Long> {
}
