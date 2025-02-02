package academy.devdojo.maratonajava.introducao;
/*
    Calcule o imposto que sera pago baseado no salário
 */
public class Aula05_EstruturasCondicionaisExercicio01 {
    public static void main(String[] args) {
        double salario = 70000;
        double semImposto;
        double impostoPago;

        if (salario <= 34712) {
            semImposto = salario-(salario * 9.7/100);
            impostoPago = salario - semImposto;
            System.out.println(impostoPago);
        } else if (salario >= 34713 && salario < 68507) {
            semImposto = salario-(salario* 37.35/100);
            impostoPago = salario - semImposto;
            System.out.println(impostoPago);
        } else {
            semImposto = salario - (salario * 49.50/100);
            impostoPago = salario - semImposto;
            System.out.println(impostoPago);
        }
    }
}
