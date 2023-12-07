package exemplo01;

public class Chefe extends Empregado {
	
	private double salario;

	public Chefe(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}

	public double Ganha() {
		return salario;
	}
	

}
