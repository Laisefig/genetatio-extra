package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int contPares =0;
		int contImpares =0;

		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "� n�mero: ");
			int num = sc.nextInt();
			if(num % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
			}
		}
		
		System.out.println("Quantidade de n�meros pares: " + contPares);
		System.out.println("Quantidade de n�meros �mpares: " + contImpares);
		
		sc.close();
	}
}
