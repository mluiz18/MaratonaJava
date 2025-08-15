package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
