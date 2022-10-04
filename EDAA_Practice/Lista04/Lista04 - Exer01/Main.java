package Lista04Agenda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Pilha agendas = new Pilha(10);
		boolean rastreioOperacao = true;

		while (rastreioOperacao == true) {
			System.out.println("ESCOLHA UMA DAS OPERAÇÕES ABAIXO\n");
			System.out.println("#-------------------------------------#");
			System.out.println("1 -> Adicionar contatos na sua agenda |");
			System.out.println("2 -> Remover contatos de sua agenda   |");
			System.out.println("3 -> Listar item do Topo da lista     |");
			System.out.println("4 -> Listar tamanho da lista          |");
			System.out.println("5 -> Trocar elemento topo com base    |");
			System.out.println("6 -> Sair do programa                 |");
			System.out.println("#-------------------------------------#\n");
			System.out.println("Entre com a opção desejada:\n");

			int operacao = input.nextInt();

			if (operacao == 1) {
				System.out.println("Digite o nome: ");
				String nome = input.next();

				System.out.println("\nDigite o número: \n\n");
				int numero = input.nextInt();

				if (agendas.full())
					System.out.println("Sua agenda está CHEIA! Sera redimensionada a seua agenda para conter o item.");

				agendas.push(nome, numero);

				System.out.println("## Adicionado com sucesso!! ##\n\n");
			}

			if (operacao == 2) {
				if (agendas.empty())
					System.out.println("Sua agenda está vazia!\n\n");
				else
					agendas.pop();
			}

			else if (operacao == 3) {
				System.out.println(agendas.top());
			}

			else if (operacao == 4) {
				System.out.println("## Você possui " + agendas.size() + " contato(s) ##\n\n");
			}

			else if (operacao == 5) {
				agendas.alterarTopoComBase();
			}

			else if (operacao == 6) {
				rastreioOperacao = false;
			}

			else {
				System.out.println("SELECIONE UM NUMERO VALIDO DE OPERAÇÃO!\n\n");
			}
		}
		input.close();
	}
}