package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio;

public class Estudante {
    public String pessoa;
    public int idade;
    public char sexo;
    public double altura;

    public void imprimi(){
        System.out.println(this.pessoa);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.altura);
    }
}
