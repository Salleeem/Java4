package com.example;

import java.util.List;
import java.util.ArrayList;

public class Curso {

    //Atributos
    private String nomeCurso;
    private List<Aluno> alunos;
    private Professor professor;

    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
        alunos = new ArrayList<>();
    }

    //Método para adicionar professor ao curso

    public void addProf(Professor professor){
        this.professor = professor;
    }

    //Método para adicionar Alunos ao curso
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void lancarNota(String nomeAluno, double notaAluno){
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                aluno.setNota(notaAluno);
                System.out.println("Nota inserida com sucesso");
                return;
            }
        }
        System.out.println("Aluno não encontrado");
    }

    //Exibir nota final de todos os alunos
    public void resultadoFinal(){
        for (Aluno aluno : alunos) {
           System.out.println(aluno.exibirInfo()); 
           aluno.avaliarDesempenho();
        }
    }

}
