package filaRecursividade;

import java.util.Scanner;

public class Recursividade01 {

	public static void main(String[] args) {
		System.out.println("## --------------------------------------------------------------------- ##");
		System.out.println("## Digite um numero INTEIRO POSITIVO para realizar a soma recursiva dele ##");
		System.out.println("## --------------------------------------------------------------------- ## \n");
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		System.out.println("A soma recursiva do numero " + n + " é: " + somaRecursiva(n, 0));
		input.close();
	}

	public static int somaRecursiva(int n, int soma) {
		if (n == 0) {
			return soma;

		} else {
			soma += n;
			n--;
			return somaRecursiva(n, soma);
		}
	}
}
