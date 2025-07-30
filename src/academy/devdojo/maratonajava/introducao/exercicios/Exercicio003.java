package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        scanner.close();
        System.out.println("Analisando o valor "+numero+" seu antecessor é "+antecessor+", e seu sucessor é "+sucessor+".");
    }
}
