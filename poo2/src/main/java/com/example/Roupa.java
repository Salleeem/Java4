package com.example;

public class Roupa extends Produto implements Transportavel{

    //Atributos

    private double volume;
    private double peso;
    
    public Roupa(String nome, double preco, double volume) {
        super(nome, preco);
        this.volume = volume;
    }


    @Override
    public double calcularFrete() {
      double valorFrete = peso * 5;
      return valorFrete;
       
    }

    @Override
    public double calcularPeso() {
        this.peso = volume * 10;
        return peso;
    }

    
}
