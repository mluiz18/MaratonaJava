package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em K: ");
        double temp = scanner.nextDouble();

        double tempEmCelsius = temp - 273.15;
        double tempEmFahreinhent = (temp - 273.15) * 1.8 + 23;

        System.out.println("Temperatura em Celsius = " + tempEmCelsius + " °C");
        System.out.println("Temperatura em Fahrenheit = " + tempEmFahreinhent + " °F");
    }
}
