import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
         
            System.out.print("Digite a população inicial do país A: ");
            int populacaoA = validarEntrada(scanner);
            System.out.print("Digite a população inicial do país B: ");
            int populacaoB = validarEntrada(scanner);

            if (populacaoA <= 0 || populacaoB <= 0) {
                System.out.println("Erro: As populações devem ser valores positivos. Tente novamente.");
                continue;
            }

            System.out.print("Digite a taxa de crescimento anual do país A (em decimal, ex: 0.03 para 3%): ");
            double taxaA = validarTaxa(scanner);
            System.out.print("Digite a taxa de crescimento anual do país B (em decimal, ex: 0.015 para 1.5%): ");
            double taxaB = validarTaxa(scanner);

            if (taxaA <= 0 || taxaB <= 0) {
                System.out.println("Erro: As taxas de crescimento devem ser valores positivos. Tente novamente.");
                continue;
            }

            int anos = 0;
ultrapasse ou iguale a população de B
            while (populacaoA < populacaoB) {
            
                populacaoA *= (1 + taxaA);
                populacaoB *= (1 + taxaB);
                anos++;
            }

            System.out.println("Número de anos necessários para que a população de A ultrapasse ou iguale a população de B: " + anos);

            System.out.print("Deseja calcular novamente? (S/N): ");
            String resposta = scanner.next().toUpperCase();
            if (!resposta.equals("S")) {
                break;
            }
        }

        scanner.close();
    }

    public static int validarEntrada(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Entrada inválida. Digite um número inteiro positivo.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    public static double validarTaxa(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida. Digite um número decimal.");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }
}
