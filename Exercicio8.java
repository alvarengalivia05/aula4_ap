import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = entrada.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("acesso concedido");
        } else {
            System.out.println("acesso negado");
        }
        entrada.close();
    }
}
