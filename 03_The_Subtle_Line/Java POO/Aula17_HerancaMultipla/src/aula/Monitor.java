package aula;

public  class Monitor extends Aluno implements Trabalhador {
	public double salario;
	
	public Monitor() {
		
	}

	public Monitor(double salario, String nome, int matricula) {
		super(nome, matricula);
		this.salario = Trabalhador.salarioBase;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void ReceberSalario() {
		System.out.println("Salário recebido com sucesso!!!");
	}
	
	public void receberAdiantamento() {
		System.out.println("Adiantamento recebimento com sucesso!!!");
	}
	
}
