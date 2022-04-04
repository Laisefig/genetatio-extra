package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		final int VALOR_POR_HORA = 10;
		final int VALOR_POR_HORA_EXTRA = 20;
		final int LIMITE_HORAS = 50;

		int C, N, E;
		int salarioBase, salarioTotal;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ol�, digite o c�digo do oper�rio: ");
		C = sc.nextInt();

		System.out.println("\nPerfeito! Agora me indique a quantidade de horas trabalhadas:");
		N = sc.nextInt();

		if (N > LIMITE_HORAS) {
			salarioBase = LIMITE_HORAS * VALOR_POR_HORA;
			E = (N - LIMITE_HORAS) * VALOR_POR_HORA_EXTRA;
		} else {
			salarioBase = N * VALOR_POR_HORA;
			E = 0;
		}
		sc.close();

		salarioTotal = salarioBase + E;
		System.out.println("====DADOS DO OPER�RIO====");
		System.out.println("C�digo: " + C);
		System.out.println("Horas trabalhadas: " + N);
		System.out.println("Sal�rio excedente: R$" + E);
		System.out.println("Sal�rio total: R$" + salarioTotal);
	}
}
