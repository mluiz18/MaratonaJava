package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        calculadora.somaDoisNumero(numero1, numero2);
        calculadora.subtracaoDoisNumero(numero1, numero2);
        calculadora.multiplicacaoDoisNumeros(numero1, numero2);
        System.out.println(calculadora.divisaoDoisNumeros(numero1, numero2));
        calculadora.imprimeDivisaoDeDoisNumeros(2,1);
        ;
    }
}
