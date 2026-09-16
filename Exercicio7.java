import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();
        System.out.println("Digite o tempo de trabalho em anos: ");
        int anos = entrada.nextInt();

        double bonus;
        if (anos >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }

        System.out.println("O valor do bônus é: R$ " + bonus);
        entrada.close();
    }
}