package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        scanner.close();
        System.out.println("É um prazer te conhecer " + nome +"!");
    }
}
