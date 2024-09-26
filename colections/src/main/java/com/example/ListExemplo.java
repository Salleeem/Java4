package com.example;

import java.util.ArrayList;
import java.util.List;

public class ListExemplo {

    //Atributos

    private List<String> nomes;

    public ListExemplo() {
        nomes = new ArrayList<>();
    }

    //Método para adicionar

    public void addList(String nome){
        nomes.add(nome);
        System.out.println(nomes.lastIndexOf(nome));
    }

    //Método para listar

    public void listarNomes(){
        System.out.println(nomes);
    }

    //Método para remover

    public void removerNomes(String nome){
        try {
            nomes.remove(nome);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Método para editar

    public void editarNomes(String nomeAntigo, String nomeNovo){
        try {
            nomes.set(, nomeNovo)
        } catch (Exception e) {
            // TODO: handl
        }

    }
}
