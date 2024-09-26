package com.example;

public class Eletronico extends Produto implements Transportavel{
    //Atributo

    private double volume;
    private double peso;

    public Eletronico(String nome, double preco, double volume) {
        super(nome, preco);
        this.volume =  volume;
    }

    //Calcular peso

    @Override
    public double calcularPeso(){
        this.peso = volume * 150;
        return peso;
    }

    //Calcular Frete

    @Override
    public double calcularFrete(){
        double valorFrete = peso*1;
        return valorFrete;
    }
}
