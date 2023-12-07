package _02_Exercicio_Esportes;

public class Futebol extends EsporteColetivo{
	

	public Futebol(String nome, int numeroJogadores) {
		super(nome, numeroJogadores);
	}
	
	@Override
	public String jogar() {
		return "⚽ Jogar bola!!!";
	}

}
