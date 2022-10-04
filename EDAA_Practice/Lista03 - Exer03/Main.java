package parImpar;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		Pilha pilha1 = new Pilha(10);
		Pilha pilha2 = new Pilha(10);
		{

			for (int num = 0; num < 10; num++) {

				System.out.println("Digite o número: ");
				int numero = input.nextInt();

				if (numero % 2 == 0)
					pilha1.push(numero);
				else
					pilha2.push(numero);
			}

			System.out.println("Realizando a desimpilhação");
			System.out.println("Sua pilha de múmeros pares");

			int tamanhoPilha1 = pilha1.size();
			int tamanhoPilha2 = pilha2.size();

			for (int num = 0; num < tamanhoPilha1; num++) {

				System.out.println("Remoção -> " + pilha1.top());
				pilha1.pop();
			}

			System.out.println("Sua pilha de números Impares");

			for (int num = 0; num < tamanhoPilha2; num++) {

				System.out.println("Remoção -> " + pilha2.top());
				pilha2.pop();
			}
		}
		input.close();
	}
}
