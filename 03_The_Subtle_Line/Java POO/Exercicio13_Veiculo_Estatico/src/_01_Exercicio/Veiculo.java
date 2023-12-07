package _01_Exercicio;

import java.util.ArrayList;

public class Veiculo {
	private String placa;
	private String ano;
	private String marca;
	private String modelo;
	private double preco;
	private Motorista motoristas;
	private static double percentualIPVA = 0.04;
	private double valorIPVA;
	
	public Veiculo(String placa, String ano, String marca, String modelo, double preco) {
		this.placa = placa;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Motorista getMotoristas() {
		return motoristas;
	}

	public void setMotoristas(Motorista motoristas) {
		this.motoristas = motoristas;
	}

	public void setValorIPVA(double valorIPVA) {
		this.valorIPVA = valorIPVA;
	}


	public static double getPercentualIPVA() {
		return percentualIPVA;
	}

	public static void setPercentualIPVA(double percentualIPVA) {
		Veiculo.percentualIPVA = percentualIPVA;
	}
	
	private double getValorIPVA() {
		valorIPVA = preco * percentualIPVA;
		return valorIPVA;
	}
	
	public void printarObjeto() {
		System.out.println(
				"Placa: " + placa +
				"\nAno: " + ano +
				"\nMarca: " + marca +
				"\nModelo: " + modelo +
				"\nPreço: R$" + preco +
				"\nMotorista: "+ motoristas.getNome() +
				"\nValor: " + getValorIPVA()
				);
		
	}
	
	
	
	

}
