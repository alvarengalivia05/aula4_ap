import java.util.Scanner;

public class DesafioVotacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não apto a votar (abaixo da idade mínima).");
        } else if ((idade >= 16 && idade < 18) || (idade >= 70)) {
            System.out.println("Apto a votar (Voto facultativo).");
        } else {
            System.out.println("Apto a votar (Voto obrigatório).");
        }
        entrada.close();
    }
}