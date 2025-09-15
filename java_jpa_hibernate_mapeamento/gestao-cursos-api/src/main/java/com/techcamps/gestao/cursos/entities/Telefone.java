package com.techcamps.gestao.cursos.entities;

import javax.persistence.*;

@Entity
@Table(name = "telefones")
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String DDD;
    private String numero;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public Telefone() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDDD() { return DDD; }
    public void setDDD(String DDD) { this.DDD = DDD; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }
}