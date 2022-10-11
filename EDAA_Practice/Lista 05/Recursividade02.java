package filaRecursividade;

import java.util.Scanner;

public class Recursividade02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero positivo e inteiro");
		int num = input.nextInt();

		while (num <= 0) {
			System.out.println("Atenção! Digite um numero POSITIVO e INTEIRO!");
			num = input.nextInt();
		}

		System.out.println("Segue sua lista do nº 0 até o nº digitado:");
		printNumeros(num, 0);

		input.close();
	}

	public static void printNumeros(int num, int numInit) {

		System.out.println(numInit);

		if (numInit < num) {
			numInit++;
			printNumeros(num, numInit);
		}
	}
}
