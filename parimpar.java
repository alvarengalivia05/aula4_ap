
import java.util.Scanner;

public class parimpar {
        public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);

            int num;

            System.out.println("Digite um numero: ");

            num = entrada.nextInt();

            if ((num % 2)==0) {
                    System.out.println( num + " = par");
            }

            else{
                System.out.println( num + " = Impar");
            }
            entrada.close();
        }
}