package model.entiry;

import model.dao.PessoaDAO;
import model.dao.ProdutoDAO;

public class Veiculo {
	private String numeroChassi;
	private String placa;
	private String modelo;
	private String marca;
	private double valor;
	private int id;

	public Veiculo() {
		
	}

	public Veiculo(String numeroChassi, String placa, String modelo, String marca, double valor) {
		super();
		this.numeroChassi = numeroChassi;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
	}

	public String getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String nome) {
		this.marca = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void inserir() {
		System.out.println("Carro");
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.inserir(this);
	}

		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
