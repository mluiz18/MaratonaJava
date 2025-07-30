package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepetição03 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue; // -> é exato oposto do break, ao invés de parar, o continue continua, meio que obvio, mas o continue "reseta" o loop, ignorando tudo abaixo dele.
            }
            System.out.println("Parcela = " + parcela + ", Valor da parcela = R$" + valorParcela);
        }
    }
}