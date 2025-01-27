package academy.devdojo.maratonajava.introducao;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos vão guardar em memória um valor simples
        // (int, double, float, char, byte, short, long e boolean)
        // Para declarar variáveis, nos informamos o tipo primitivo dela, em seguida o nome da váriavel, seguindo uma convenção
        // Convenção: A Primeira palavra toda em minúsculo, e se tiver mais de uma, a primeira letra de cada palavra é maiúscula.

        int ageFather = 35; // valores inteiros "pequenos"
        long bigNumber = 1000000; // valores inteiros grandes
        float salaryFloat = 2500.0F; // valores decimais pequenos
        double salaryDouble = 2000.0; // valores reais grandes
        byte numberByte = 127; // valores capazes de serem armazenados em 1 byte (8 bits)
        short numberShort = 10; // valores capazes de serem armazenados em 2 bytes (16 bits)
        boolean True = true; // Valores verdadeiros ou falsos
        boolean False = false; // Valores verdadeiros ou falsos
        char character = 77; // Capaz de armazenar 1 caractere ou valores da tabela ASCII ou Tabela Unicode

        System.out.println("Idade: " + ageFather + " anos");
        System.out.println("Salário: R$" + salaryFloat);
        System.out.println(character);
    }
}
