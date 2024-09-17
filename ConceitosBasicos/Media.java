package ConceitosBasicos;

import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4]; // Array para armazenar as 4 notas
        double somaNotas = 0.0;
        
        // Loop para capturar as notas das 4 disciplinas
        for (int i = 0; i < 4; i++) {
            while (true) {
                try {
                    // Captura a nota do aluno para cada disciplina
                    System.out.print("Digite a nota da disciplina " + (i + 1) + ": ");
                    notas[i] = scanner.nextDouble();
                    
                    // Verifica se a nota está entre 0 e 10
                    if (notas[i] >= 0 && notas[i] <= 10) {
                        break; // Sai do loop se a nota for válida
                    } else {
                        System.out.println("A nota deve estar entre 0 e 10.");
                    }
                } catch (Exception e) {
                    System.out.println("Por favor, insira um valor numérico.");
                    scanner.next(); // Limpa a entrada inválida
                }
            }
            somaNotas += notas[i]; // Soma as notas
        }
        
        // Calcula a média
        double media = somaNotas / notas.length;
        
        // Verifica se todas as notas são maiores que 9 para aplicar o bônus
        boolean aplicarBonus = true;
        for (double nota : notas) {
            if (nota <= 9) {
                aplicarBonus = false;
                break;
            }
        }
        
        // Aplica o bônus de 10% se necessário
        if (aplicarBonus) {
            media *= 1.10;
        }
        
        // Exibe a média final
        System.out.printf("Média final: %.2f\n", media);
        
        // Verifica e exibe o status do aluno
        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }
        
        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
