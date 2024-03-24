public class Populacao {


    public static void Main(String[] args) {
        int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaA = 1.03;
        double taxaB = 1.015;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA *= taxaA;
            populacaoB *= taxaB;
            anos++;
        }

        System.out.println("Número de anos necessários para que a população de A ultrapasse ou iguale a população de B: " + anos);
    }
}