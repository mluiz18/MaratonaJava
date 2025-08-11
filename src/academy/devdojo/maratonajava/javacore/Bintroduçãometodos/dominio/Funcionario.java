package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void mediaSalarios(double... sals) {
        double soma = 0;
        for (double sal : sals) {
            soma += sal;
        }
        System.out.println("Média salários = " + (soma/3));
    }
}
