package Exercicio05_Retangulo;

public class Retangulo {

	double lado1;
	double lado2;
	double area;
	double perimetro, resultadoPerimetro, resultadoArea;
	String mensagem;
	
	public Retangulo() {
		
	}
	
	public Retangulo(double lado1) {
		this.lado1 = lado1;
	}
	
	public Retangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	

	
	void alteraLado2(double lado2) {
		this.lado2= lado2;
	}
	
	void calculaArea () {
		resultadoArea = lado1 * lado2;
	}
	
	void calculaPerimetro() {
		resultadoPerimetro = (lado1*2) + (lado2*2);
	}
	
	String perimetroTotal() {
		mensagem = "Valor do perímetro:"+resultadoPerimetro;
		return mensagem;
	}
	
	String areaTotal() {
		mensagem = "Valor da área:"+resultadoArea;
		return mensagem;
	}
	
	

}
