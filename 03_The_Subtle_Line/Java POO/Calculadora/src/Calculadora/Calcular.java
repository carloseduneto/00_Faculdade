package Calculadora;

public class Calcular {
	
	
	double numero1;
	double numero2;
	double resultado;
	String operador;
	String mensagem;
	
	void alteraNumero1(double valor1){
		numero1 = valor1;
	}
	
	

	void alteraOperador(String simbolo) {
		operador = simbolo;
	}
	
	void alteraNumero2(double valor2){
		numero2 = valor2;
	}
	
	String resulucao() {
		if (operador == "+") {
			resultado = numero1 + numero2;
			mensagem = numero1 + " + " + numero2 + " = " + resultado;
			
	}else if (operador == "-") {
		resultado = numero1 - numero2;
		mensagem = numero1 + " - " + numero2 + " = " + resultado;
		
	}else if (operador == "/") {
		resultado = numero1 / numero2;
		mensagem = numero1 + " / " + numero2 + " = " + resultado;
		
	}else if (operador == "x") {
		resultado = numero1 * numero2;
		mensagem = numero1 + " x " + numero2 + " = " + resultado;
	
}
		return mensagem;
}
}
