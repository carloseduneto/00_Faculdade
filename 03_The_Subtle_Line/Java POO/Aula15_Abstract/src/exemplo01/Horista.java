package exemplo01;

public class Horista extends Empregado {
	private double valor;
	private double horas;
	
	public Horista(String nome, int idade, double valor, double horas) {
		super(nome, idade);
		this.valor = valor;
		this.horas = horas;
	}
	
	public double Ganha() {
		return valor+horas;
	}


}
