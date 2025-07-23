package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {

        // Para declarar variáveis, nos informamos o tipo primitivo dela, em seguida o nome da váriavel, seguindo uma convenção
        // Convenção: A Primeira palavra toda em minúsculo, e se tiver mais de uma, a primeira letra de cada palavra é maiúscula.

        int ageFather = 35;
        long bigNumber = 1000000;
        float salaryFloat = 2500.0F;
        double salaryDouble = 2000.0;
        byte numberByte = 127;
        short numberShort = 10;
        boolean True = true;
        boolean False = false;
        char character = 77;
        String text = "Miguel";
        Short num = 18;

        // A Partir do java 10, é possivel declarar uma variavel somente com um var antes do nome
        // Ex: var nome = "Miguel" <- o compilador entende

        System.out.println("Idade: " + ageFather + " anos");
        System.out.println("Salário: R$" + salaryFloat);
        System.out.println(character);
        System.out.println("Meu nome é " + text);
        System.out.println(num);

        // Casting -> forço ao compilador a colocar um numero de bits em outro (mesmo que ele não suporte)
        // pora isso o java vai começar a cortar bit pra encaixar, saindo um número estranho
        int Idade = (int) 10000000000L;
        System.out.println(Idade);


    }
}
