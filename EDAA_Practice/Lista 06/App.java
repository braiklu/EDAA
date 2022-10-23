package buscaOrdenacao;

import java.util.Scanner;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		int array[] = new int[500];
		Random random = new Random();
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10000);
		}

		System.out.print("Digite um numero para descobrir sua posicao na array\n");
		int numeroDigitado = entrada.nextInt();

		Metodos action = new Metodos();

		long startBinario = System.nanoTime();
		System.out.println(action.buscaBinaria(array, numeroDigitado));
		long endBinario = System.nanoTime();

		long startSeque = System.nanoTime();
		action.buscaSequencial(numeroDigitado, array);
		long endSeque = System.nanoTime();

		System.out.println("Tempo gasto - Busca Binária \n" + (endBinario - startBinario) + " nano segundos");
		System.out.println("Tempo gasto - Busca Sequencial \n" + (endSeque - startSeque) + " nano segundos");

		action.printArray(array);
		entrada.close();
	}
}
