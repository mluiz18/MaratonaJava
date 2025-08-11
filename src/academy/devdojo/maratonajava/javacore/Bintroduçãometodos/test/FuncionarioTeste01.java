package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.nome = "Miguel";
        funcionario01.idade = 18;
        funcionario01.salario = 5000F;

        funcionario02.nome = "Luiza";
        funcionario02.idade = 18;
        funcionario02.salario = 5000F;

        funcionario03.nome = "Ignácio";
        funcionario03.idade = 32;
        funcionario03.salario = 5000F;

        double[] salarios = new double[4];
        salarios[1] = funcionario01.salario;
        salarios[2] = funcionario02.salario;
        salarios[3] = funcionario03.salario;

        funcionario01.imprimir();
        funcionario02.imprimir();
        funcionario03.imprimir();

        funcionario01.mediaSalarios(salarios);
    }
}
