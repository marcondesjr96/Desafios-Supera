package desafio_02;

import java.util.List;
import java.util.Scanner;

public class SegundoDesafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		double dinheiro = scanner.nextDouble();

		List<Integer> notas = List.of(100, 50, 20, 10, 5, 2);

		List<Double> moedas = List.of(1.0, 0.50, 0.25, 0.10, 0.05, 0.01);


		System.out.println("NOTAS:");
		for(int nota : notas) {
			int total = (int) (dinheiro / nota);
			System.out.println(String.format("%d nota(s) de %.2f", total,(float) nota));
			dinheiro -= total * nota;
		}
		
		System.out.println("MOEDAS:");
		for(double moeda : moedas) {
			int total = (int) (dinheiro / moeda);
			System.out.println(String.format("%d moeda(s) de R$ %.2f", total, moeda));
			dinheiro -= total * moeda;
		}
		
	}

}
