package Aula0001;

public class Aluno {
	String nome;
	double nota1;
	double nota2;
	double media;
	
	void cadastraAluno (String novoAluno) {
		nome = novoAluno;
	}
	
	void cadastrarNotas(double n1, double n2) {
		nota1 = n1;
		nota2 = n2;
	}
	
	void calcularMedia() {
		media = (nota1 + nota2) / 2;
	}
	
	String retornarMedia() {
		return nome + " sua média foi: " + media;
	}
}
