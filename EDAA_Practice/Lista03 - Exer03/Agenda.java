package parImpar;

public class Agenda {

	public String nome;
	public long tel;

	public Agenda(String nome, long tel) {

		this.nome = nome;
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}
}
