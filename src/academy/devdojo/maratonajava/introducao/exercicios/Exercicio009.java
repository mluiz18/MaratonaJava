package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de R$");
        double quantidade = scanner.nextFloat();
        scanner.close();
        double operacao = quantidade/5.54 ;
        System.out.println(operacao);
    }
}
