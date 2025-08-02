package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida (em metros): ");
        float medida = scanner.nextFloat();
        float medidaEmCM = medida*100;
        float medidaEmMM = medida*1000;
        System.out.println(medida + " em centímetros é " + medidaEmCM);
        System.out.println(medida + " em milímetros é " + medidaEmMM);
    }
}
