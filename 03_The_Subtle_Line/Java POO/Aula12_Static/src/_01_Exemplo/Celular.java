package _01_Exemplo;

public class Celular {
	private String descricao;
	private double preco;
	private static double dolar;
	
	public Celular(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public static double getDolar() {
		return dolar;
	}
	

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static void setDolar(double dolar) {
		Celular.dolar = dolar;
	}

	public double getPrecoEmDolar() {
		return preco/dolar;
	}
	

}
