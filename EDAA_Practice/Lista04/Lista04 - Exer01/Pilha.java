package Lista04Agenda;

public class Pilha {

	private int tamanhoLimite;
	private Agenda[] itens;
	private String [] agendas;
	private int topo;

	public Pilha(int n) {
		tamanhoLimite = n;
		itens = new Agenda[n];
		topo = 0;
		agendas = new String [n];
	}

	public void push(String nome, long telefone) {
		if (full()) {
			aumentarTam();
		}
		itens[topo] = new Agenda(nome, telefone);
		topo++;
	}

	public void alterarTopoComBase() {
		Agenda topoItem = itens[topo - 1];
		Agenda baseItem = itens[0];

		itens[topo - 1] = topoItem;
		itens[0] = baseItem;
	}

	private void aumentarTam() {
		tamanhoLimite += tamanhoLimite;
		Agenda[] aumentoPilha = new Agenda[tamanhoLimite];

		for (int i = 0; i < itens.length; i++)
			aumentoPilha[i] = itens[i];

		itens = aumentoPilha;
	}

	public void pop() {
		topo--;
	}

	public String top() {
		return agendas[topo - 1];
	}

	public boolean empty() {
		return (topo == 0);
	}

	public boolean full() {
		return (topo == tamanhoLimite);
	}

	public int size() {
		return topo;
	}

}
