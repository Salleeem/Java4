package ConceitosBasicos;

import java.util.Scanner;



public class CalculadoraAv {

    //Atributos

    double a;
    double b;
    double resultado;
    int escolha;

    Scanner sc = new Scanner(System.in);

    // Métodos das operações

    // Soma
    public double soma(double a, double b) {
        resultado = a + b;
        return resultado;
    }

    // Subtração
    public double sub(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    // Multiplicação
    public double mult(double a, double b) {
        return a * b;
    }

    // Divisão
    public double div(double a, double b) {
        try {
            resultado = a / b;

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    // Raiz
    public double root(double a) throws Exception {

        if (a < 0) {
            throw new Exception("Não existe raiz de número negativo");
        }
        try {
            resultado = Math.sqrt(a);
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    //Criar método para o menu

    public void menu() {

        System.out.println("Calculadora");
        System.out.println("1: Soma");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: divisão");
        System.out.println("5: Raiz Quadrada");
        System.out.println("6: Sair");

    }

    // Entrada de Dados

    public void entradaDados() {

        if (escolha >= 1 && escolha < 5) {
            System.out.println("Digite o valor a:");
            sc.nextDouble();
            System.out.println("Digite o valor b:");
            sc.nextDouble();

        } else if (escolha == 5) {

            System.out.println("Digite o valor a:");
            sc.nextDouble();

        } else if (escolha == 6) {

            System.out.println("Saindo....");

        } else{

            System.out.println("Valor Inválido, Digite um valor válido");
        }
    }

    // Calculadora

    public void calculadora() {
        do {
            menu();
            try {
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                        entradaDados();
                        soma(a, b);
                        break;

                    case 2:
                        entradaDados();;
                        sub(a, b);
                        break;
                    
                    case 3:
                        entradaDados();;
                        mult(a, b);
                        break;

                    case 4:
                        entradaDados();
                        div(a, b);
                        break;
                    
                    case 5:
                        entradaDados();
                        root(a);
                        break;
                    
                    case 6:
                    entradaDados();

                    default:
                    entradaDados();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (escolha != 6);
    }

}
