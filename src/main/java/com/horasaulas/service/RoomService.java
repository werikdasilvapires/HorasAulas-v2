package com.horasaulas.service;

import com.horasaulas.model.Room;
import com.horasaulas.model.ClassSchedule;
import com.horasaulas.repository.RoomRepository;
import com.horasaulas.repository.ClassScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private ClassScheduleRepository classScheduleRepository;

    public List<Map<String, Object>> listarHorariosDasSalas() {
        List<Room> salas = roomRepository.findAll();
        List<ClassSchedule> horarios = classScheduleRepository.findAll();
        Map<Long, List<ClassSchedule>> horariosPorSala = new HashMap<>();
        for (ClassSchedule horario : horarios) {
            if (horario.getSala() != null) {
                horariosPorSala.computeIfAbsent(horario.getSala().getId(), k -> new ArrayList<>()).add(horario);
            }
        }
        List<Map<String, Object>> resultado = new ArrayList<>();
        for (Room sala : salas) {
            Map<String, Object> mapa = new HashMap<>();
            mapa.put("idSala", sala.getId());
            mapa.put("nomeSala", sala.getNome());
            List<Map<String, Object>> ocupados = new ArrayList<>();
            List<ClassSchedule> horariosSala = horariosPorSala.getOrDefault(sala.getId(), Collections.emptyList());
            for (ClassSchedule horario : horariosSala) {
                Map<String, Object> o = new HashMap<>();
                o.put("diaSemana", horario.getDiaSemana());
                o.put("horaInicio", horario.getHoraInicio());
                o.put("horaFim", horario.getHoraFim());
                ocupados.add(o);
            }
            mapa.put("ocupados", ocupados);
            resultado.add(mapa);
        }
        return resultado;
    }
}
