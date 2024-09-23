package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends Pessoa implements Avaliavel {
    //Matricula
    private String matricula;
    private double nota;


    //Construtor

    public Aluno(String nome, String cpf, String matricula){
        super(nome, cpf);
        this.matricula = matricula;
        this.nota = 0.0;
    }

    //Polimorfismo  - Sobreescrita  

    @Override
    public String exibirInfo(){
        super.exibirInfo();
        return "Mátricula: " + matricula + "Nota: " + nota;
    }

    @Override
    public void avaliarDesempenho() {
        if (nota >= 7) {
            System.out.println("Aluno Aprovado");
        }else if (nota >=5 && nota < 7) {
            System.out.println("Aluno de recuperção");
        }else{
            System.out.println("Aluno reprovado");
        }
        
    }


}
