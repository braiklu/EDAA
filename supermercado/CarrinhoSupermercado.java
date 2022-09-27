package edaa;

public class CarrinhoSupermercado {

	private Produto[] produtos = new Produto[10];
	private int last = 0;
	private int first = 0;

	public CarrinhoSupermercado(int i) {
	}

	public boolean vazio() {
		return (this.first == 0);
	}

	public void Inserir(Produto prd1) {
		if (this.last >= this.produtos.length) {
			System.out.println("### Sua lista de compras esta cheia ###");
		} else {
			this.produtos[this.last] = prd1;
			this.last++;
			System.out.println("!!! Foi colocado o produto no carrinho com sucesso !!!");
		}
	}

	public void Remover(int pos) {
		if (pos >= this.produtos.length) {
			System.out.println("Digite um valor de 1 a 10 para realizar a remoçao do item do carrinho:");

		} else if (pos > last) {
			System.out.println("Nao foi possível encontrar o produto em seu carrinho de compras!");

		} else {
			produtos[pos - 1] = null;
					
            while (pos < last) {
                produtos[pos - 1] = produtos[pos];
                pos++;
				}
		}
		System.out.println("$$ Foi removido o item de seu carrinho de compras, Gabriel! $$");
	}
	

	public void Limpar() {
		this.produtos = new Produto[this.produtos.length];
	}

	public void Imprimir() {
		for (Produto item : produtos) {
			System.out.println("Produto -> " + item);
		}
	}
}
