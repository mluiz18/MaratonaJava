package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        Scanner jose = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = jose.nextInt();
        jose.close();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i +" x " + numero + " = " + numero*i);
        }
    }
}
