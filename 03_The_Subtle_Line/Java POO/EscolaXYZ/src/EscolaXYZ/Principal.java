package EscolaXYZ;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno novoAluno = new Aluno();
		novoAluno.cadatroNome("Jéssica Alcântara");
		novoAluno.cadastroEndereco("Rua Da Casa Dela, Bairro Dela, 999");
		novoAluno.cadastroTelefone(999888111);
		novoAluno.cadastroEmail("jessica@email.com");
		System.out.println(novoAluno.exibirCadastro());
	}

}
