package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AlunoIOReader dados = new AlunoIOReader();
        System.out.println("A média da turma foi de " + dados.mediaAlunos());
        System.out.println("" + dados.alunoComMenorNota());
        System.out.println("" + dados.alunoComMaiorNota());
    }
}