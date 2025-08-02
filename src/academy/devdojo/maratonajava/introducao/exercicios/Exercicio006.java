package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota1: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite a nota2: ");
        float nota2 = scanner.nextFloat();
        float media = (nota1 + nota2)/2;
        scanner.close();
        System.out.println("Media: "+media);
    }
}
