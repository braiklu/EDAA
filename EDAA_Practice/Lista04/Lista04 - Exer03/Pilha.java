package parImpar;

public class Pilha {

	private int[] itens;
	private int topo;
	private int tamanhoLimite;

	public Pilha(int n) {
		itens = new int[n];
		tamanhoLimite = n;
		topo = 0;
	}

	public void push(int numero) {
		if (full()) {
			tamanhoLimite = tamanhoLimite * 2;
			int[] novoCampo = new int[tamanhoLimite];
			itens = novoCampo;
		}

		itens[topo] = numero;
		topo++;
	}

	public int top() {
		return itens[topo - 1];
	}

	public void pop() {
		if (!empty())
			topo--;
	}

	public int size() {
		return topo;
	}

	public boolean empty() {
		return (topo == 0);
	}

	public boolean full() {
		return (topo == tamanhoLimite);
	}

	public void changeTopWithBase() {
		int itemTopo = itens[topo - 1];
		int primeiroItem = itens[0];

		itens[topo - 1] = primeiroItem;
		itens[0] = itemTopo;
	}
}
