package com.horasaulas.repository;

import com.horasaulas.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositório para entidade Sala
public interface RoomRepository extends JpaRepository<Room, Long> {
}
