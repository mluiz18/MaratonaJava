package academy.devdojo.maratonajava.javacore.Bintroduçãometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.pessoa);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.altura);
        estudante.pessoa = "Ricardo";
        // sempre que eu precisar atribuir algum valor a um objeto de referencia, eu envio uma cópia (vou aprender ainda como faz)
    }
}
