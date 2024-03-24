import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Digite o 1º número: ");
        double maiorNumero = scanner.nextDouble();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}
