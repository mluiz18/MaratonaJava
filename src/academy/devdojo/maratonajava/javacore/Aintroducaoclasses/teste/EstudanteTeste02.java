package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.Pessoa = "Ricardo";
        estudante.altura = 1.60;
        System.out.println(estudante.Pessoa);
        System.out.println(estudante.Idade);
        System.out.println(estudante.Sexo);
        System.out.println(estudante.altura);
        System.out.println("-------------------");
        System.out.println(estudante1.Pessoa);
        System.out.println(estudante1.Idade);
        System.out.println(estudante1.Sexo);
    }
}
