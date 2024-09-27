package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class AlunoIOReader {
    String arquivo = "C:\\Users\\DevTarde\\Desktop\\J4\\dados1\\arquivo.txt";
    List<Aluno> alunos;
    double mediaTurma = 0;

    public void readerFileIO(){
        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] conteudo = linha.split(",");
                Aluno aluno = new Aluno(
                 conteudo[0],
                 Double.parseDouble(conteudo[1]),
                 Double.parseDouble(conteudo[2]),
                 Double.parseDouble(conteudo[3])
                );
                alunos.add(aluno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double mediaAlunos(){
        for (Aluno  aluno: alunos) {
            mediaTurma += aluno.mediaNotas();
            
        }

        mediaTurma /= alunos.size();
        return mediaTurma;
    }

    public String alunoComMaiorNota(){
        String nomeAluno = "";
        double maiorNota = 0;
        for (Aluno aluno : alunos) {
            if (maiorNota > aluno.maiorNota()) {
                maiorNota = aluno.maiorNota();
                nomeAluno = aluno.getNome();
            }
        }
        return "Aluno com maior nota é " + nomeAluno + "Com a nota de: " + maiorNota;
     }

     public String alunoComMenorNota(){
        String nomeAluno = "";
        double menorNota = 10;
        for (Aluno aluno : alunos) {
            if (menorNota < aluno.menorNota()) {
                menorNota = aluno.menorNota();
                nomeAluno = aluno.getNome();
            }
        }
        return "Aluno com maior nota é " + nomeAluno + "Com a nota de: " + menorNota;
     }

}
