package Exercicio03;

public class Restaurante {
	
	int numeroClientes;
	double resultadoDivisao;
	double valorGasto;
	
	String mensagem;
	
	
	
	
	void valoresClientes(int Clientes, double Compra) {
		//Altera as variáveis
		numeroClientes = Clientes;
		valorGasto = Compra;
		
		//Cálculos
		resultadoDivisao = valorGasto / numeroClientes;
	}
	
	String exibeResultado (){
		mensagem = "São "+ numeroClientes + " e cada um pagará: R$" + resultadoDivisao;
		
		return mensagem;
		
	}
	
	
	
}
