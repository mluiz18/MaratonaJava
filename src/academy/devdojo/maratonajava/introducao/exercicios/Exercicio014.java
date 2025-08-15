package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = scanner.nextInt();
        int soma = 0;
        for (int i = 0; i <= num; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
