import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura (ex: 1.75): ");
        double altura = entrada.nextDouble();
        System.out.println("Digite o sexo (M para masculino / F para feminino): ");
        char sexo = entrada.next().toUpperCase().charAt(0);

        double pesoIdeal = 0;
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal masculino é: " + pesoIdeal);
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal feminino é: " + pesoIdeal);
        } else {
            System.out.println("Sexo inválido!");
        }
        entrada.close();
    }
}