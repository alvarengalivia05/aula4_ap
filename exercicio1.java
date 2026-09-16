import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero > 20) {
            double metade = (double) numero / 2;
            System.out.println("A metade de " + numero + " é: " + metade);
        } else {
            System.out.println("O número não é maior que 20.");
        }
        entrada.close();
    }
}
