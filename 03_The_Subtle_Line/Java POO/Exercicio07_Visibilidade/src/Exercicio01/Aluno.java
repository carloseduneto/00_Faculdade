package Exercicio01;

public class Aluno {
	private String nome;
	private String telefone;
	private double nota1;
	private double nota2;
	private double media;
	private int faltas;
	

	public Aluno(String nome, String telefone ) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void lancarNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void lancarNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	protected void adicionarFalta() {
		faltas = faltas +1;
	}
	
	public void calculaMedia() {
		media = (nota1 + nota2)/2;
		if (faltas == 0) {
			media +=1;
		}else if (faltas <5) {
			media = media + 0.5;
		}
	}
	
	public String imprimir() {
		String frase;
		if(media <=10) {
		frase = "O aluno " + nome
				+ " com o telefone " + telefone
				+ ", teve: \nNota 1: "+ nota1
				+ "\nNota 2: "+ nota2
				+ "\nMédia final: " + media;
				
				
		
		}else{
		frase = "Notas inválidas???";
		}
		
		return frase;
	}

}
