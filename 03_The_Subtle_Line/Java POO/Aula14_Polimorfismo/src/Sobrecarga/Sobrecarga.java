package Sobrecarga;

public class Sobrecarga {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public Sobrecarga(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Sobrecarga(String nome, int idade, double altura, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	double calculaImc() {
		return peso/(altura*altura);
	}
	
	public double calculaImc(double altura, double peso) {
		return peso/(altura*altura);
	}
	
	

}
