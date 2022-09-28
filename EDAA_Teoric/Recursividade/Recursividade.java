package lista;

import java.util.Scanner;

//Lucas Braich - RA 121115890

public class Recursividade {

	public static void main(String[] args) {

		System.out.println("Digite um número para que seja realizado uma soma recursiva com base nele.");

		try (Scanner entrada = new Scanner(System.in)) {
			int num = entrada.nextInt();

			System.out.println("Soma do recursiva do número informado é " + soma_Recursao(num));
		}
	}

	public static int soma_Recursao(int num) {
		if (num == 0) {
			return 0;
		} else {
			return num + soma_Recursao(num - 1);
		}
	}
}
