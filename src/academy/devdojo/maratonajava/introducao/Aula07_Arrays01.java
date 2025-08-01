package academy.devdojo.maratonajava.introducao;

public class Aula07_Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        for (int i = 0; i < 3; i++) {
            idades[i] = i;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(idades[i]);
        }
    }
}
