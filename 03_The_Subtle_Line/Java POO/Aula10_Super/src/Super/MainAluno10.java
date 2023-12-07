package Super;

public class MainAluno10 {
	public static void print(Object linha) {
		System.out.println(linha);
	}
	
	public static void main(String[] args) {
		Aluno novoAluno = new Aluno("João Vinícius", 33, 006533, "Sistemas de Informação");
		print(novoAluno.getCurso());
		print(novoAluno.getNome());
		print(novoAluno.getIdade());
		print(novoAluno.getMatricula());
		novoAluno.falar();

	}

}
