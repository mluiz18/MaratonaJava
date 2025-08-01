package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07_Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Miguel";
        nomes[1] = "Luiza";
        nomes[2] = "Adalberto";
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int Nm = scanner.nextInt();

        int[] numeros = new int[Nm];
        for (int i = 0; i < Nm; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }
    }
}
