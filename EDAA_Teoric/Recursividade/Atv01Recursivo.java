package lista;


public class Atv01Recursivo {

	// Lucas Braich - RA 121115890
	public static void main(String[] args) {
		Atv01Recursivo ip = new Atv01Recursivo();
		ip.imprimir(5);

	}

	private void imprimir(int x) {
		int soma = 0;
		for (int cont = 0; cont <= x; cont++) {
			soma = soma + cont;
			System.out.println(soma);
		}
		System.out.println("Soma dos pares: " + soma);
	}

}
