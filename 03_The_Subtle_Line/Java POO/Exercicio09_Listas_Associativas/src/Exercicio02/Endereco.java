package Exercicio02;

import java.util.ArrayList;

public class Endereco {
	private String rua;
	private int numero;
	private ArrayList<Cliente> clientes;
	
	

	public Endereco(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
		this.clientes = new ArrayList<>();
	}
	
	public void adicionarCliente(Cliente novoCliente) {
		clientes.add(novoCliente);
	}


	public String getRua() {
		return rua;
	}


	public int getNumero() {
		return numero;
	}
	
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}

	public void exibir() {
		System.out.println("Rua "+ rua + " Nº: "+ numero);
	}


}
