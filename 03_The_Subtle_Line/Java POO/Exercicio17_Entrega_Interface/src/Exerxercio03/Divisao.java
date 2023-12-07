package Exerxercio03;

public class Divisao implements OperacaoMatematica {
	private double a;
	private double b;
	private double resultado;
	
	public Divisao() {
	
	}
	
	
	
	public double Calcule (double a, double b) {
		if (b != 0) {
			resultado = a / b;
		}else {
			resultado = 0;
		}
		return resultado;
	}

}
