package Empresa;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	private double valorVendido;
	private double percentualComissao;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	public Funcionario(String nome, String cargo, double salario, double valorVendido, double percentualComissao) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.valorVendido = valorVendido;
		this.percentualComissao = percentualComissao;
	}
	
	public void setSalarioMinimo () {
		if (salario > 650) {
			salario = 650;
		}
	}
		
	public void setComissao() {
		if (percentualComissao > 0 && percentualComissao < 0.25) {
			valorVendido = valorVendido * (1 + percentualComissao);
		}
	}
	
	public void setVendas() {
		if (valorVendido < 0) {
			valorVendido = 0;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public double getSalario() {
		salario = salario + valorVendido;
		return salario;
	}
	
	public double getComissao() {
		return valorVendido;
	}
	
	

}
