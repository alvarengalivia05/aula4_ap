import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário bruto: ");
        double salarioBruto = entrada.nextDouble();
        System.out.println("Digite o valor da prestação: ");
        double prestacao = entrada.nextDouble();

        double limite = salarioBruto * 0.30;

        if (prestacao <= limite) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }
        entrada.close();
    }
}