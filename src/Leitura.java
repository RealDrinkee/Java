import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");

        String filme = leitura.nextLine();

        System.out.println("Qual ano de lançamento: ");

        int anoDeLancamento = leitura.nextInt();

        System.out.println("Avaliçao do filme: ");

        double avaliacaoFilme = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacaoFilme);
    }
}
