package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Luiza");
        funcionario.setIdade(18);
        funcionario.setSalario(new double[]{1200,987.32,2000});
        funcionario.imprimir();
        System.out.println(funcionario.getMedia());
    }
}
