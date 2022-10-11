package filaRecursividade;

import java.util.Scanner;

public class Recursividade03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o número da base da potência (k):");
		int k = input.nextInt();

		System.out.println("Digite o número de expoente da potência (n):");
		int n = input.nextInt();

		int result = exponencialRecursividade(k, n, 0, 1);
		System.out.println("Resultado de " + k 
							+ " elevado a " + n 
							+ " -> " + 
							result);

		input.close();
	}

	public static int exponencialRecursividade(int k, int n, int multiplica, int total) {

		total = total * k;
		multiplica++;

		if (multiplica == n)
			return total;
		else
			return exponencialRecursividade(k, n, multiplica, total);
	}
}
