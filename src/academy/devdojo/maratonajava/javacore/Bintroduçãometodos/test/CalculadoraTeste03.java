package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] vetor = {1,2,3};
        calculadora.somaArray(vetor);
        calculadora.somaVarargs(1,2,3,4,5,6,7);
    }
}
