package com.horasaulas.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department departamento;

    @ManyToOne
    @JoinColumn(name = "title_id")
    private Title titulo;

    private String nome;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Department getDepartamento() { return departamento; }
    public void setDepartamento(Department departamento) { this.departamento = departamento; }
    public Title getTitulo() { return titulo; }
    public void setTitulo(Title titulo) { this.titulo = titulo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
