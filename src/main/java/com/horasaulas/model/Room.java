package com.horasaulas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building predio;

    private String nome;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Building getPredio() { return predio; }
    public void setPredio(Building predio) { this.predio = predio; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
