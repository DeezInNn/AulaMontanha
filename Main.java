import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    double nota;
    do {
      System.out.println("Digite uma nota entre 0 e 10:  ");
      nota = scanner.nextDouble();
      
      if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida, digite uma nota entre 0 a 10 ");
      
      }
    }while (nota < 0 || nota > 10);
      System.out.println("Nota válida: " + nota);
  }
}