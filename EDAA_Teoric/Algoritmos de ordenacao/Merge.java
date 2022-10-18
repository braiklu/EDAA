package ordenacao;

public class Merge {

	 public static int[] sort(int[] items) {
	        if (items == null)
	            return new int[0];
	        else if (items.length < 2)
	            return items;
	        
	        mergeSort(items, 0, items.length - 1);
	        
	        return items;
	    }
	 
	public static void merge(int arr[], int p, int q, int r) {

		int dado1 = q - p + 1;
		int dado2 = r - q;

		int arr1[] = new int[dado1];
		int arr2[] = new int[dado2];

		for (int i = 0; i < dado1; i++)
			arr1[i] = arr[p + i];

		for (int j = 0; j < dado2; j++)
			arr2[j] = arr[q + 1 + j];

		int i = 0, j = 0, k = 0;

		while (i < dado1 && j < dado2) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;

			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < dado1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}

		while (j < dado2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int arr[], int esquerda, int direita) {
		if (esquerda < direita) {

			int mid = (esquerda + direita) / 2;

			mergeSort(arr, esquerda, mid);
			mergeSort(arr, mid + 1, direita);

			merge(arr, esquerda, mid, direita);
		}
	}

	public static void printArray(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n; ++i)

			System.out.print(arr[i] + " - ");
	}
}
