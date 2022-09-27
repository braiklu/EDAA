package edaa;

public class Main {

	public static void main(String[] args) {

		CarrinhoSupermercado carrinho = new CarrinhoSupermercado(10);

		Produto prd1 = new Produto("Pera", "Pera Portuguesa", 2, 2.24);
		Produto prd2 = new Produto("Uva", "Uva sem semente", 4, 6.23);
		Produto prd3 = new Produto("Banana", "Banana caturra", 3, 7.47);
		Produto prd4 = new Produto("Maça", "Maça chinesa", 8, 4.63);
		Produto prd5 = new Produto("Goiaba", "Goiaba verde", 7, 8.99);
		Produto prd6 = new Produto("Mexerica", "Mexerica d'agua", 2, 8.50);
		Produto prd7 = new Produto("Manga", "Manga rosa", 5, 2.41);
		Produto prd8 = new Produto("Cenoura", "Cenoura amarela", 6, 7.41);
		Produto prd9 = new Produto("Morango", "Morango campinas", 8, 8.01);
		Produto prd10 = new Produto("Limao", "Limao Siliciano", 4, 2.41);

		carrinho.Inserir(prd1);
		carrinho.Inserir(prd2);
		carrinho.Inserir(prd3);
		carrinho.Inserir(prd4);
		carrinho.Inserir(prd5);
		carrinho.Inserir(prd6);
		carrinho.Inserir(prd7);
		carrinho.Inserir(prd8);
		carrinho.Inserir(prd9);
		carrinho.Inserir(prd10);

		carrinho.Imprimir();

		System.out.println("Solicitado a remoção do item 1 de seu carrinho de compras!");
		carrinho.Remover(1);

		carrinho.Imprimir();

		System.out.println("Solicitado a limpeza da lista de compras");
		carrinho.Limpar();

		carrinho.Imprimir();
	}
}