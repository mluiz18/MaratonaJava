package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepetiçãoExercicio01 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int c = 0;

        while (c <= 1000000) {
            if (c % 2 == 0) {
                System.out.println(c + " é par");
            }
            c++;
        }
    }
}
