package exercicio04;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcionario f1 = new Funcionario("F�bio", 25, 2000d);

		System.out.println("Quanto voc� cobra por sua hora extra? ");
		double valorHoraExtra = sc.nextDouble();

		f1.setValorHoraExtra(valorHoraExtra);

		System.out.println("Ok!");

		System.out.println("Quantas horas extra voc� trabalhou neste m�s? ");
		int horasExtrasTrabalhadas = sc.nextInt();

		f1.setHorasExtrasTrabalhadas(horasExtrasTrabalhadas);

		System.out.println(f1);
		
		sc.close();

	}

}
