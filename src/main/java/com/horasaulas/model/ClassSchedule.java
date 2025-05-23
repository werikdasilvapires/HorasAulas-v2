package com.horasaulas.model;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "class_schedule")
public class ClassSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassEntity turma;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room sala;

    private int diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public ClassEntity getTurma() { return turma; }
    public void setTurma(ClassEntity turma) { this.turma = turma; }
    public Room getSala() { return sala; }
    public void setSala(Room sala) { this.sala = sala; }
    public int getDiaSemana() { return diaSemana; }
    public void setDiaSemana(int diaSemana) { this.diaSemana = diaSemana; }
    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }
    public LocalTime getHoraFim() { return horaFim; }
    public void setHoraFim(LocalTime horaFim) { this.horaFim = horaFim; }
}
