package Socio;

public class Dependente {
	private String nome;
	private int idade;
	private Socio socio;

	
	
	public Dependente(String nome, int idade, Socio socio) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.idade = idade;
		this.socio = socio;
		socio.adicionarDepedente(this);
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public Socio getSocio() {
		return socio;
	}



	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	

}
