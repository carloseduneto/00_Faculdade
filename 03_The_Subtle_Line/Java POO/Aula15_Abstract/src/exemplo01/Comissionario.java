package exemplo01;

public class Comissionario extends Empregado {
	private double salario;
	private double comissao;
	private int vendas;
	
	public Comissionario(String nome, int idade, double salario, double comissao, int vendas) {
		super(nome, idade);
		this.salario = salario;
		this.comissao = comissao;
		this.vendas = vendas;
	}
	
	public double Ganha() {
		return (salario + (comissao * vendas));
	}

}
