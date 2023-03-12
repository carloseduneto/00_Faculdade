package Exercicio6_Filmes;

public class AvaliarFilmes {

	String titulo, anoLancamento, categoria, mensagem;
	double media, nota1, nota2, nota3, nota4, nota5;
	
	
	public AvaliarFilmes() {
		// TODO Auto-generated constructor stub
		anoLancamento= "Ano filme";
	}
	
	public void alteraNome(String nome) {
		titulo = nome;
	}
	
	public void alteraAno(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public void alteraCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void alteraNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void alteraNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public void alteraNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public void alteraNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public void alteraNota5(double nota5) {
		this.nota5 = nota5;
	}
	
	
	public void calculaMedia() {
		media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
	}
	
	public String retornaAvalicao() {
		mensagem = "A avaliação do filme " + titulo
				+ ", lancado em " + anoLancamento
				+ ", da categoria " + categoria
				+ ", tem média de " + media
				+ " estrelas.";		
		return mensagem;
	}
	
	
}
