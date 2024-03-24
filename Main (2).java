import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Erro: O nome deve ter mais de 3 caracteres. Tente novamente.");
                continue;
            }
            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(scanner.nextLine());
            if (idade < 0 || idade > 150) {
                System.out.println("Erro: A idade deve estar entre 0 e 150 anos. Tente novamente.");
                continue;
            }
            System.out.print("Digite seu salário: ");
            double salario = Double.parseDouble(scanner.nextLine());
            if (salario <= 0) {
                System.out.println("Erro: O salário deve ser maior que zero. Tente novamente.");
                continue;
            }
            System.out.print("Digite seu sexo (f/m): ");
            char sexo = scanner.nextLine().toLowerCase().charAt(0);
            if (sexo != 'f' && sexo != 'm') {
                System.out.println("Erro: O sexo deve ser 'f' ou 'm'. Tente novamente.");
                continue;
            }
            System.out.print("Digite seu estado civil (s/c/v/d): ");
            char estadoCivil = scanner.nextLine().toLowerCase().charAt(0);
            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("Erro: O estado civil deve ser 's', 'c', 'v' ou 'd'. Tente novamente.");
                continue;
            }
            System.out.println("Cadastro realizado com sucesso!");
            break;
        }

        scanner.close();
    }
}
