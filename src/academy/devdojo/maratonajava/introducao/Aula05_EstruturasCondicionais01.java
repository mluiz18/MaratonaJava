package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais01 {
    public static void main(String[] args) {
        boolean teste = false;
        int dirigirIdade = 20;
        boolean isAutorizadoATirarCarteira = dirigirIdade < 18;
        String frase = "Isso é uma frase";

        if (teste == false) {
            System.out.println("O Valor de teste é falso.");
        }else{
            System.out.println("O Valor de teste é verdadeiro.");
        }

        // o ! serve como um inversor, se a variavel for positiva ele vai transforma-la em negativa
        if (!isAutorizadoATirarCarteira) {
            System.out.println("Permitido!");
        }

        if(frase == "Isso é uma frase") {
            System.out.println("A Frase foi dita!");
        }
    }
}
