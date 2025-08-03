package academy.devdojo.maratonajava.introducao;

public class Aula08_ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][1] = 2;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        // utilizando o foreach
        for (int[] arr : dias) {
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
}
