package EscolaXYZ;

public class Aluno {
	private String nomeAluno, enderecoResidencial, email, mensagem;
	private int telefone;
	
	void cadatroNome(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	void cadastroEndereco(String enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
	}

	void cadastroTelefone(int numero) {
		this.telefone = numero;
	}
	
	void cadastroEmail(String email) {
		this.email = email;
	}
	
	String exibirCadastro() {
		mensagem = "Nome: " + nomeAluno
				+ "\nEndereço: " + enderecoResidencial
				+ "\nTelefone: " + telefone
				+ "\nEmail: " + email;
		
		return mensagem;
	}
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

}
