package academy.devdojo.maratonajava.introducao;

public class Aula04_Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos (+ - * / %)
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero1+numero2);
        // Se você colocar uma frase antes, o Java vai colocar o sinal de + para funcionar concatenando, ou seja ele vai juntar as palavras.
        String frase = "A Soma é: ";
        System.out.println(frase+numero1+numero2);
        // Para solucionar isso basta guardar o valor da operação em uma terceira variável.
        int resultadoSoma = numero1 + numero2;
        System.out.println(frase + resultadoSoma);

        // % <- operador aritmetico de resto de divisão.
        int resto = 256%2;
        System.out.println(resto);

        // Operadores Relacionais (<, >, <=, >=, ==, !=)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);

        // Operadores Lógicos (and (&&) e or (||) e not(!))
        int idade = 25;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double precoPlayStation5 = 3200;
        boolean canComprarPlayStation5 = valorTotalContaCorrente >= precoPlayStation5 || valorTotalContaPoupanca >= precoPlayStation5;
        System.out.println("canComprarPlayStation5 " + canComprarPlayStation5);

        // Operadores de Atribuição (=, +=, -=, *=, /=, %=) -> uma forma de escrever menos linhas de código.
        int bonus = 2000;
        bonus += 1000; // 3.000
        bonus -= 1000; // 2.000
        bonus *= 1000; // 2.000.000
        bonus /= 1000; // 2.000
        bonus %= 1000; // 0
        System.out.println(bonus);

        // Contadores Unários
        // ++ -- -> forma mais abreviada ainda dos operadores de atribuição
        int contador = 0;
        contador++; // vai adicionar +1 DEPOIS de usar a variavel
        contador--; // vai subtrair -1 DEPOIS de usar a variavel
        ++contador; // vai adicionar +1 ANTES de usar a variavel
        --contador; // vai subtrair -1 ANTES de usar a variavel
        System.out.println(contador);

    }
}

