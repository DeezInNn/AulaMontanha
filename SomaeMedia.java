import java.util.Scanner;

public class SomaEMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 5;
        int soma = 0;

       
        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / quantidadeNumeros;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
