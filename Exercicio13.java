import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = entrada.nextDouble();
        System.out.println("Digite a operação (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            System.out.println("Resultado: " + (n1 + n2));
        } else if (operacao == '-') {
            System.out.println("Resultado: " + (n1 - n2));
        } else if (operacao == '*') {
            System.out.println("Resultado: " + (n1 * n2));
        } else if (operacao == '/') {
            if (n2 <= 0) {
                System.out.println("Impossível dividir!!");
            } else {
                System.out.println("Resultado: " + (n1 / n2));
            }
        } else {
            System.out.println("Sinal Inválido");
        }
        entrada.close();
    }
}