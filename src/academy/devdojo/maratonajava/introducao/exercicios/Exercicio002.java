package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite um número: ");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;
        scanner.close();
        System.out.println("A Soma de " + numero1 + " + " + numero2 + " = " + soma);

    }
}
