package _02_Exercicio_Esportes;

public abstract class EsporteColetivo extends Esporte{
	private int numeroJogadores;
	
	public EsporteColetivo(String nome, int numeroJogadores) {
		super(nome);
		this.numeroJogadores = numeroJogadores;
	}
	
	@Override
	public String jogar() {
		return "Jogo coletivo";
	}

}
