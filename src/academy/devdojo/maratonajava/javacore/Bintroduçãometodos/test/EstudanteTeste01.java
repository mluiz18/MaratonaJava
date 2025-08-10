package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.pessoa = "Miguel";
        estudante01.idade = 18;
        estudante01.sexo = 'M';
        estudante01.altura = 1.64;

        estudante02.pessoa = "Luiza";
        estudante02.idade = 18;
        estudante02.sexo = 'F';
        estudante02.altura = 1.54;

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
    }
}
