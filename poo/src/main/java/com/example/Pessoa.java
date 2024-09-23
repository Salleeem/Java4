package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter
public class Pessoa {

    // Atributos
    private String nome;
    private String cpf;

    // Exibir informações
    public String exibirInfo() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
