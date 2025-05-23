package com.horasaulas.controller;

import com.horasaulas.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/salas")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/horarios")
    public List<Map<String, Object>> listarSalasHorarios() {
        return roomService.listarHorariosDasSalas();
    }
}
