package com.horasaulas.service;

import com.horasaulas.model.Professor;
import com.horasaulas.model.ClassSchedule;
import com.horasaulas.repository.ProfessorRepository;
import com.horasaulas.repository.ClassScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;
    @Autowired
    private ClassScheduleRepository classScheduleRepository;

    public List<Map<String, Object>> listarProfessoresComTotalDeHoras() {
        List<Professor> professores = professorRepository.findAll();
        List<ClassSchedule> horarios = classScheduleRepository.findAll();
        Map<Long, Double> horasPorProfessor = new HashMap<>();
        for (ClassSchedule horario : horarios) {
            if (horario.getTurma() != null && horario.getTurma().getProfessor() != null) {
                Long idProfessor = horario.getTurma().getProfessor().getId();
                double horas = Duration.between(horario.getHoraInicio(), horario.getHoraFim()).toMinutes() / 60.0;
                horasPorProfessor.put(idProfessor, horasPorProfessor.getOrDefault(idProfessor, 0.0) + horas);
            }
        }
        return professores.stream().map(professor -> {
            Map<String, Object> mapa = new HashMap<>();
            mapa.put("idProfessor", professor.getId());
            mapa.put("nomeProfessor", professor.getNome());
            mapa.put("totalHoras", horasPorProfessor.getOrDefault(professor.getId(), 0.0));
            return mapa;
        }).collect(Collectors.toList());
    }
}
