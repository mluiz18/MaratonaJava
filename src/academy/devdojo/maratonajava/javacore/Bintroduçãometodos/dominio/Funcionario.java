package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double sal : this.salario) {
            System.out.println(sal);
        }
        mediaSalarios(this.salario);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void mediaSalarios(double... sals) {
        for (double sal : sals) {
            this.media += sal;
        }
        System.out.println("Média salários = " + (media/3));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media / 3;
    }
}
