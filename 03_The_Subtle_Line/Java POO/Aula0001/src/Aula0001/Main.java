package Aula0001;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1;
		pessoa1 = new Pessoa();
		pessoa1.nome = "Fulano";
		pessoa1.idade= 20;
		System.out.println("Olá "+ pessoa1.nome);
		System.out.println("Sua idade é "+ pessoa1.idade);
		
		Aluno aluno1;
		aluno1 = new Aluno();
		
		aluno1.cadastraAluno("João Carlos");
		aluno1.cadastrarNotas(5.6, 9.8);
		aluno1.calcularMedia();
		System.out.println(aluno1.retornarMedia());
	}
	
}
