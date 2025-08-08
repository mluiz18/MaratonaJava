package academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.dominio;

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

}
