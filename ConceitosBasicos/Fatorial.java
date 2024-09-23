package ConceitosBasicos;

import java.util.Scanner;

public class Fatorial {
    int n = -1;

    Scanner sc = new Scanner(System.in);

    public long calculoFatorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else{
            return n*calculoFatorial(-1);
        }
    }

    public void calculadora(){
        System.out.println("Digite um numero para calcular o fatorial");
        numero = sc.nextInt();
        if (numero < 0) {
            throw new Exception 
            
        }
    }
}
