package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        if (num1 % 2 == 0) {
            System.out.println(num1 + " é par!");
        } else {
            System.out.println(num1 + " é impar!");
        }
    }
}
