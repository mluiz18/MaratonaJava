package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1° número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o 2° número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println(num1 + " é igual á " + num2);
        }
    }
}
