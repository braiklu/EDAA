package edaa;

public class Produto {

	private String nome;
	private String descricao;

	private double valorFinal;

	public int product;
	private int quantidade;

	public Produto(String nome, String descricao, int quantidade, double valorFinal) {
		this.quantidade = quantidade;
		this.valorFinal = valorFinal;
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// De acordo com o enunciado da questão
	public String toString() {
		return "Quant. = " + quantidade + ", Valor do produto = R$" + valorFinal + ", Nome do Produto = " + nome
				+ ", Descricao = " + descricao;
	}
}