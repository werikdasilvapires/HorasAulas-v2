package com.horasaulas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "class")
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject disciplina;

    private int ano;
    private int semestre;
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Subject getDisciplina() { return disciplina; }
    public void setDisciplina(Subject disciplina) { this.disciplina = disciplina; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }
}
