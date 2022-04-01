package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();

		if (checaPar(numero)) {
			System.out.println("O n�mero � par e sua raiz quadrada �: " + calculaRaiz(numero));
		} else {
			System.out.println("O n�mero � �mpar e seu quadrado �: " + elevaQuadrado(numero));
		}

	}

	public static boolean checaPar(int num) {
		return num % 2 == 0;
	}

	public static double calculaRaiz(int num) {
		return Math.sqrt(num);
	}

	public static int elevaQuadrado(int num) {
		return num * num;
	}
}
