package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        int dobro = n*2;
        int triplo = n*3;
        scanner.close();
        System.out.println("Analisando o valor " + n);
        System.out.println("Seu dobro é "+ dobro);
        System.out.println("Seu triplo é "+ triplo);
    }
}
