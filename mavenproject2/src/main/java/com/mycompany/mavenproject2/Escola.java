/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;

public class Escola {
    private final String nome;
    private final String endereco;
    private final List<Aluno> alunos;
    private final List<Professor> professores;

    public Escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}