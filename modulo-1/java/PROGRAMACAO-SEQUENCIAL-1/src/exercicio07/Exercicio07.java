package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		double a, b, c;
		double d, e, f;
		double x, y;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do coeficiente a: ");
		a = sc.nextInt();
		System.out.print("Digite o valor do coeficiente b: ");
		b = sc.nextInt();
		System.out.print("Digite o valor do coeficiente c: ");
		c = sc.nextInt();
		System.out.print("Digite o valor do coeficiente d: ");
		d = sc.nextInt();
		System.out.print("Digite o valor do coeficiente e: ");
		e = sc.nextInt();
		System.out.print("Digite o valor do coeficiente f: ");
		f = sc.nextInt();

		double denominador = (a * e) - (b * d);
		x = ((c * e) - (b * f)) / denominador;
		y = ((a * f) - (c * d)) / denominador;
		
		System.out.println("x=" + Math.round(x) + " y=" + Math.round(y));

		sc.close();
	}

}
