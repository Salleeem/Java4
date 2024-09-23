package com.example;

public class ExemploConteudoBasico {

    public void operacoes() {
        int a = 20;
        int b = 30;
        double c = 7.8;
        char letra = 'd';
        boolean teste = false;

        teste = (a > b) || (c < 8);

        System.out.println("resultado de a+b " + (a + b));
        System.out.println("resultado para teste" + teste);
        System.out.println(letra);

    }

    // Controles de fluxo

    public void ControleDeFluxo() {
        // If-Else
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Switch
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Outro dia");
        }

        //Laços de Repetição

         // For Loop
         for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }

        // While Loop
        int contador = 5;
        while (contador > 0) {
            System.out.println("Contador: " + contador);
            contador--;
        }

    }
}
