package Exercicio01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno novoAluno = new Aluno("Jéssica", "(44) 07666-1213");
		novoAluno.lancarNota1(6);
		novoAluno.lancarNota2(7);
		//novoAluno.adicionarFalta();
		novoAluno.calculaMedia();
		System.out.println(novoAluno.imprimir());
	}

}
