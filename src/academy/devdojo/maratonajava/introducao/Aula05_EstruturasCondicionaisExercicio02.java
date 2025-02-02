package academy.devdojo.maratonajava.introducao;
/*
    Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
    considere: 1 como domingo
 */

public class Aula05_EstruturasCondicionaisExercicio02 {
    public static void main(String[] args) {
        byte dia = 1;
        switch(dia) {
            case 1:
                System.out.println("Domingo - Final de Semana");
                break;
            case 2:
                System.out.println("Segunda - Dia útil");
                break;
            case 3:
                System.out.println("Terça - Dia útil");
                break;
            case 4:
                System.out.println("Quarta - Dia útil");
                break;
            case 5:
                System.out.println("Quinta - Dia útil");
                break;
            case 6:
                System.out.println("Sexta - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Final de Semana");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
