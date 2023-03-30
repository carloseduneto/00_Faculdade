package Calculadora;

public class Calcula {
	private double umNumero;
	private String simbolo;
	private double outroNumero;
	private double oResultado;
	
	public void setUmNumero(double umNumero) {
		this.umNumero = umNumero;
	}
	
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	public void setOutroNumero(double outroNumero) {
		this.outroNumero = outroNumero;
	}
	
	public void setCalcula () {
		if (simbolo == "+") {
			oResultado = umNumero + outroNumero;
		
		}else if (simbolo == "-") {
			oResultado = umNumero - outroNumero;
		
		}else if (simbolo == "x") {
			oResultado = umNumero * outroNumero;
			
		}else if (simbolo == "/" && outroNumero != 0) {
			oResultado = umNumero / outroNumero;
		}
	}
	
	public double getCalcula() {
		return oResultado;
	}
	
	public Calcula() {
		// TODO Auto-generated constructor stub
	}

}
