package Aula0001;

public class Pessoa {
	String nome;
	int idade;
	void alterarNome (String novoNome) {
		nome = novoNome;
	}
	String retornarNome() {
		return nome;
	}
	int aumentaIdade(int aumento) {
		int novaIdade = idade + aumento;
			return novaIdade;
	}
}

