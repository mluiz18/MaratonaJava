package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepetição01 {
    public static void main(String[] args) {

        // while
        int n = 1;
        while (n < 10) {
            System.out.println(n++);
        }

        //do while -> vai executar pelo menos uma vez, ja que a verificação da expressão booleana está depois do bloco de código a ser executado.
        do {
            System.out.println("do-while");
        } while (n < 10);

        //for
        for (int i = 0; i < 10; i++) { // for (inicialização de variavel; até onde a variavel vai ser executada; passo);
            System.out.println("for " + i);
        }
    }
}
