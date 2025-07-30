package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepetiçãoExercicio02 {
    // dado o valor de um carro, descobra quants vezes ele pode ser parcelado
    // condição é que valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = 1; parcela < valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela >= 1000) {
                System.out.println("Parcela = " + parcela + ", Valor da parcela = R$" + valorParcela);
            } else if (valorParcela < 1000) {
                break;
            }
        }
    }
}