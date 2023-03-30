package Empresa;

public class Empresa {
	private String nome;
	private int idade;
	private double salario;
	private Departamento departamento;
	
	public Empresa() {
		
	}
	
	public Empresa(String nome, int idade, double salario, Departamento departamento) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.departamento = departamento;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setNome () {
		this.nome = nome;
	}
	
	public void setIdade() {
		this.idade = idade;
	}
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	

}
