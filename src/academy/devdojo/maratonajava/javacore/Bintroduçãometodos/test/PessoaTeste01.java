package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiza");
        pessoa.setIdade(18);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
