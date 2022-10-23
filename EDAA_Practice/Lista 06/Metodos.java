package buscaOrdenacao;

public class Metodos {

	public static void insertionSort(int array[]) {

		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int element = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > element) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = element;
		}
	}

	public void printArray(int array[]) {

		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i] + " ");

		System.out.println();
	}

	public int buscaBinaria(int array[], int x) {

		int inicio = 0;
		int fim = array.length - 1;
		int meio;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;

			if (array[meio] < x)
				inicio = meio + 1;
			else if (array[meio] <= x)
				return meio;
			else
				fim = meio - 1;
		}
		return -1;
	}

	public void buscaSequencial(int valor, int num[]) {

		int cont = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == valor) {
				cont++;
			}
		}
		
	}
}
