package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um número: ");
        float num2 = scanner.nextInt();
        scanner.close();
        float media = (num1 + num2)/2;
        System.out.println("A Média é "+media);
    }
}
