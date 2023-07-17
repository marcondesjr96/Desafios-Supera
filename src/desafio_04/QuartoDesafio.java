package desafio_04;

import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número de casos de teste

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            int meio = linha.length() / 2;

            StringBuilder sb = new StringBuilder();

            for (int j = meio - 1; j >= 0; j--) {
                sb.append(linha.charAt(j));
            }

            for (int j = linha.length() - 1; j >= meio; j--) {
                sb.append(linha.charAt(j));
            }

            String desembaralhada = sb.toString();
            System.out.println(desembaralhada);
        }
    }
}
