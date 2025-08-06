package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

/*
    Crie uma classe carro com os seguintes atributos:
            Nome
            Modelo
            Ano
    Em seguida, crie dois objetos diferentes e imprima seus valores;
 */

public class CarroExercicio01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        //Carro01
        carro01.Nome = "Mazda";
        carro01.Modelo = "RX-7 FD3S";
        carro01.ano = 1999;

        //Carro02
        carro02.Nome = "Volkswagen";
        carro02.Modelo = "Parati";
        carro02.ano = 1994;

        System.out.println("Marca: " + carro01.Nome + ", Modelo: " + carro01.Modelo + ", Ano: " + carro01.ano);
        System.out.println("Marca: " + carro02.Nome + ", Modelo: " + carro02.Modelo + ", Ano: " + carro02.ano);

        carro02 = carro01;
        System.out.println("Marca: " + carro02.Nome + ", Modelo: " + carro02.Modelo + ", Ano: " + carro02.ano);
    }
}
