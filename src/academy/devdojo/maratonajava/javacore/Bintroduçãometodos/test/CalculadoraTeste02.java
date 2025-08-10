package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        // escopo de variável
        int num1 = 18;
        int num2 = 36;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Fora da classe 'alteraDoisNumeros'.");
        System.out.println(num1);
        System.out.println(num2);
    }
}
