package desafio_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TerceiroDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int alvo = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();

        while (arraySize-- > 0) {
            numeros.add(scanner.nextInt());
        }
        int total = 0;

        for (int n : numeros) {
            for (int i : numeros) {
                if (n - i == alvo) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}
