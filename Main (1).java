import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite seu nome de usuário: ");
            String username = scanner.nextLine();
            System.out.print("Digite sua senha: ");
            String password = scanner.nextLine();
            if (password.equals(username)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");
            } else {
                System.out.println("Cadastro realizado com sucesso!");
                break; 
            }
        }

        scanner.close();
    }
}
