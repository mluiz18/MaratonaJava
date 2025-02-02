package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        int salario = 3000;
        String mensagemDoar = "Eu doei :)";
        String mensagemNaoDoar = "Eu não doei :(";
        // Sintaxe Operador Ternário: Variável = (condição) ? caso condição = true : caso condição = false
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
