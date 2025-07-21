package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepetição01 {
    public static void main(String[] args) {

        // while
        int n = 1;
        while (n < 10) {
            n = n + 1;
            System.out.println(n);
        }

        //do while
        do {
            System.out.println("do-while");
        } while (n < 10);

        //for
        for (int i = 0; i < 10; i++) {
            System.out.println("for " + i);
        }
    }
}
