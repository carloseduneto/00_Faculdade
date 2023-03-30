package Get_set;

public class Pessoa {

	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		if (novaIdade < 0) {
			idade = 0;
		}else {
			idade = novaIdade;
		}
	}
	
	public Pessoa() {
		
	}

}
