import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int n2 = entrada.nextInt();

        if (n1 == n2) {
            System.out.println("Números iguais");
        } else if (n1 > n2) {
            System.out.println("A diferença é: " + (n1 - n2));
        } else {
            System.out.println("A diferença é: " + (n2 - n1));
        }
        entrada.close();
    }
}