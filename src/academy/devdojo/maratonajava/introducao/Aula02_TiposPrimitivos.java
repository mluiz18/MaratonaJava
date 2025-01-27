package academy.devdojo.maratonajava.introducao;

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
        System.out.println("Idade: " + ageFather + " anos");
        System.out.println("Salário: R$" + salaryFloat);
        System.out.println(character);
    }
}
