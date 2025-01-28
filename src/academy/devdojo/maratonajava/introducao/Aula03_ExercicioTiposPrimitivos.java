package academy.devdojo.maratonajava.introducao;
/*
Exercício: Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

"Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salário>, na data <data>."
 */
public class Aula03_ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        double salario = 25000;
        String data = "18 de abril de 2024";
        String nome = "Miguel Luiz Amaral da Silva Barbosa";
        String endereco = "Av. Rio Branco, 505";
        String confimacaoSalario = "Eu, " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$" + salario + ", na data " + data;

        System.out.println(confimacaoSalario);
    }
}
