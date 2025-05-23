package com.horasaulas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "subject_prerequisite")
public class SubjectPrerequisite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject disciplina;

    @ManyToOne
    @JoinColumn(name = "prerequisiteid")
    private Subject preRequisito;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Subject getDisciplina() { return disciplina; }
    public void setDisciplina(Subject disciplina) { this.disciplina = disciplina; }
    public Subject getPreRequisito() { return preRequisito; }
    public void setPreRequisito(Subject preRequisito) { this.preRequisito = preRequisito; }
}
