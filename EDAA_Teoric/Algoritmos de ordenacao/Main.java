package ordenacao;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int[] items = gerador(20);
		System.out.println("#--------- Array de entrada com 20 elementos ---------#");
		calculoTimeMerge(items);
		calculoTimeInsertion(items);

		items = gerador(20000);
		System.out.println("#------- Array de entrada com 20.000 elementos -------#");
		calculoTimeMerge(items);
		calculoTimeInsertion(items);
	}

	public static void calculoTimeMerge(int[] items) {
		
		long inicioMerge = System.nanoTime();
		Merge.sort(items);
		long finalMerge = System.nanoTime() - inicioMerge;

		System.out.println("Merge Sort executado em ~" + finalMerge + " nano segundos");
	}

	public static void calculoTimeInsertion(int[] items) {
		
		long inicioInsertion = System.nanoTime();
		Insertion.sort(items);
		long finalInsertion = System.nanoTime() - inicioInsertion;

		System.out.println("Insertion Sort executado em ~" + finalInsertion + " nano segundos");
		System.out.println();
	}

	// CONSULTA: https://www.geeksforgeeks.org/intstream-generate-method-java/
	// CONSULTA: https://www.tutorialspoint.com/intstream-generate-method-in-java
	public static int[] gerador(int size) {
		int max = 30000;
		return IntStream.generate(() -> new Random().nextInt(max)).limit(size).toArray();
	}
}