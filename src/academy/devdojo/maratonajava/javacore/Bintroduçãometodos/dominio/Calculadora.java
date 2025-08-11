package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio;

public class Calculadora {

    public void somaDoisNumero(int numero1, int numero2) {
        System.out.println(numero1 + numero2);
    }

    public void subtracaoDoisNumero(int numero1, int numero2) {
        System.out.println(numero1 - numero2);
    }

    public void multiplicacaoDoisNumeros(int numero1, int numero2) {
        System.out.println(numero1 * numero2);
    }

    public double divisaoDoisNumeros(int numero1, int numero2) {
        if (numero2 == 0) {
            return 0;
        } else {
            return (numero1 / numero2);
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão por 0");
            return; //"break" do void
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 999;
        num2 = 33;
        System.out.println("Dentro da classe 'alteraDoisNumeros'.");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }

    public void somaArray(int[] arr) {
        int soma = 0;
        for (int temp : arr) {
            soma += temp;
        }
        System.out.println(soma);
    }

    public void somaVarargs(int... num) {
        int soma = 0;
        for (int temp : num) {
            soma += temp;
        }
        System.out.println(soma);
    }
}
