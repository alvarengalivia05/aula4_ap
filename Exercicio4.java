import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        if (n1 > n2) {
            System.out.println("Ordem decrescente: " + n1 + ", " + n2);
        } else {
            System.out.println("Ordem decrescente: " + n2 + ", " + n1);
        }
        entrada.close();
    }
}