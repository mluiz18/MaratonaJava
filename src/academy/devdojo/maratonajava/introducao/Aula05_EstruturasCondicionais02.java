package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 21;
        String categoria;

        if (idade < 15) {
            categoria = "infantil";
        }else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
