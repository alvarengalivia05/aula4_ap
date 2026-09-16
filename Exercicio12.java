import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        double salario = entrada.nextDouble();

        double desconto = 0;
        if (salario <= 600.0) {
            System.out.println("Isento de INSS");
        } else if (salario <= 1200.0) {
            desconto = salario * 0.20;
            System.out.println("Desconto do INSS (20%): R$ " + desconto);
        } else if (salario <= 2000.0) {
            desconto = salario * 0.25;
            System.out.println("Desconto do INSS (25%): R$ " + desconto);
        } else {
            desconto = salario * 0.30;
            System.out.println("Desconto do INSS (30%): R$ " + desconto);
        }
        entrada.close();
    }
}