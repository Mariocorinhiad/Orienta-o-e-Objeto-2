/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
public class Programa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 15, 12345);
        Professor professor1 = new Professor("Maria", 35, "Matemática");

        Escola escola = new Escola("Escola ABC", "Rua XYZ");
        escola.adicionarAluno(aluno1);
        escola.adicionarProfessor(professor1);

        System.out.println("Nome da Escola: " + escola.getNome());
        System.out.println("Endereço: " + escola.getEndereco());

        System.out.println("\nAlunos:");
        for (Aluno aluno : escola.getAlunos()) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }

        System.out.println("\nProfessores:");
        for (Professor professor : escola.getProfessores()) {
            System.out.println("Nome: " + professor.getNome() + ", Disciplina: " + professor.getDisciplina());
        }
    }
}