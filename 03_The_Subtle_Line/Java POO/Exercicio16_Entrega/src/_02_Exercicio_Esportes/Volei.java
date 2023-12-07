package _02_Exercicio_Esportes;

public class Volei extends EsporteColetivo{
	

	public Volei(String nome, int numeroJogadores) {
		super(nome, numeroJogadores);
	}
	
	@Override
	public String jogar() {
		return "🏐 Saque realizado!!!";
	}

}
