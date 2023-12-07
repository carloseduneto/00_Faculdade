package model.entiry;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import SistemaDeCartao.GeradorDeString;
import model.dao.CartaoDAO;

public class Titular {
	private String nomeTitular;
	private String documentoTitular;
	private ArrayList<CartaoDeCredito> cartoes;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCartoes(ArrayList<CartaoDeCredito> cartoes) {
		this.cartoes = cartoes;
	}

	public Titular(String nomeTitular, String documentoTitular) {
		this.nomeTitular = nomeTitular;
		this.documentoTitular = documentoTitular;
		cartoes = new ArrayList<CartaoDeCredito>();
	}
	
	public Titular() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CartaoDeCredito criarCartao (double limite, int idTitular, String nome) {
		GeradorDeString numero = new GeradorDeString();
		String numeroDoCartao = numero.gerarStringAleatoria(16);
		System.out.println(numeroDoCartao);
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataDaquiTresAnos = dataAtual.plusYears(3);
		CartaoDeCredito novoCartao = new CartaoDeCredito(numeroDoCartao, dataDaquiTresAnos, limite);
		CartaoDAO cartaoDAO01 = new CartaoDAO();
		cartaoDAO01.inserir(novoCartao, idTitular, nome);
		return novoCartao;
	}
	
	public CartaoDeCredito criarCartaoAdicional (double limite, int idTitular,String nomeAdicional) {
		GeradorDeString numero = new GeradorDeString();
		String numeroDoCartao = numero.gerarStringAleatoria(16);
		System.out.println(numeroDoCartao);
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataDaquiTresAnos = dataAtual.plusYears(3);
		
		CartaoDeCredito cartaoAdicional = new CartaoDeCredito(numeroDoCartao, dataDaquiTresAnos, limite, nomeAdicional);
		
		CartaoDAO cartaoDAO01 = new CartaoDAO();
		cartaoDAO01.inserir(cartaoAdicional, idTitular, nomeAdicional);
		return cartaoAdicional;
		
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public ArrayList<CartaoDeCredito> getCartoes() {
		return cartoes;
	}

	public void setCartoes(CartaoDeCredito cartao) {
		this.cartoes.add(cartao);
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getDocumentoTitular() {
		return documentoTitular;
	}

	public void setDocumentoTitular(String documentoTitular) {
		this.documentoTitular = documentoTitular;
	}

	public String getCpf() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
