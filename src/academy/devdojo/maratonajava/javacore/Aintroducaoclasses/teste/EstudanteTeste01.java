package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.Idade = 18;
        estudante.Pessoa = "Miguel";
        estudante.Sexo = 'M';
        System.out.println(estudante.Pessoa);
        System.out.println(estudante.Idade);
        System.out.println(estudante.Sexo);
    }
}
