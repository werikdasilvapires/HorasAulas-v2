package com.horasaulas.controller;

import com.horasaulas.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/professores")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping("/horas-aula")
    public List<Map<String, Object>> listarProfessoresComHoras() {
        return professorService.listarProfessoresComTotalDeHoras();
    }
}
