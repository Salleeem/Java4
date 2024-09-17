package ConceitosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    // Construtor para inicializar os atributos do funcionário
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // Getters para acessar os dados do funcionário
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    // Método para exibir as informações do funcionário
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Salário: R$ " + salario;
    }
}

public class CadastroEmpresa {
    // Lista para armazenar os funcionários
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    // Método para adicionar um novo funcionário
    public static void adicionarFuncionario(String nome, int idade, double salario) {
        Funcionario funcionario = new Funcionario(nome, idade, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    // Método para remover um funcionário pelo nome
    public static void removerFuncionario(String nome) {
        boolean encontrado = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionarios.remove(funcionario);
                System.out.println("Funcionário " + nome + " removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário " + nome + " não encontrado.");
        }
    }

    // Método para listar todos os funcionários cadastrados
    public static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }

    // Método para calcular a média salarial dos funcionários
    public static void calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado para calcular a média salarial.");
            return;
        }

        double somaSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            somaSalarios += funcionario.getSalario();
        }

        double mediaSalarial = somaSalarios / funcionarios.size();
        System.out.printf("A média salarial dos funcionários é: R$ %.2f\n", mediaSalarial);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Menu de opções
            System.out.println("\n--- Sistema de Gerenciamento de Funcionários ---");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Calcular Média Salarial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        // Adicionar novo funcionário
                        System.out.print("Digite o nome do funcionário: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite a idade do funcionário: ");
                        int idade = Integer.parseInt(scanner.nextLine());
                        System.out.print("Digite o salário do funcionário: ");
                        double salario = Double.parseDouble(scanner.nextLine());
                        adicionarFuncionario(nome, idade, salario);
                        break;

                    case 2:
                        // Remover funcionário pelo nome
                        System.out.print("Digite o nome do funcionário a ser removido: ");
                        String nomeRemover = scanner.nextLine();
                        removerFuncionario(nomeRemover);
                        break;

                    case 3:
                        // Listar todos os funcionários
                        listarFuncionarios();
                        break;

                    case 4:
                        // Calcular média salarial
                        calcularMediaSalarial();
                        break;

                    case 0:
                        // Sair do programa
                        System.out.println("Saindo do sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número para selecionar a opção.");
                opcao = -1; // Para garantir que o loop continue
            }

        } while (opcao != 0);

        scanner.close();
    }
}
