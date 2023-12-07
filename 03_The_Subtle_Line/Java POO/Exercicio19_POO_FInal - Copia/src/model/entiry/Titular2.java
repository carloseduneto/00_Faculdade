package model.entiry;

import model.dao.TitularDAO;

public class Titular2 {
	
	public Titular2() {
		// TODO Auto-generated constructor stub
	}
	
	public Titular2(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public void inserir() {
		System.out.println("Pessoa");
		TitularDAO pessoaDAO = new TitularDAO();
		pessoaDAO.inserir(this);
	}

	private int id;
	private String nome;
	private String cpf;
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
