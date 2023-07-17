package desafio_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entrada = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for(int i = 0; i < entrada; i++) {
            int valor = scanner.nextInt();
            if(valor % 2 == 0) {
                pares.add(valor);
            }else{
                impares.add(valor);
            }

        }
        pares.stream()
                .sorted()
                .forEach(System.out::println);

        impares.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}
