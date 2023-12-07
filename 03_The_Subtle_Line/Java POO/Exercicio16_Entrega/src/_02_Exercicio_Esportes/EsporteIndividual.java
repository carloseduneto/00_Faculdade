package _02_Exercicio_Esportes;

public abstract class EsporteIndividual extends Esporte{
	private String equipamento;
	
	public EsporteIndividual(String nome, String equipamento) {
		super(nome);
		this.equipamento = equipamento;
	}
	
	@Override
	public String jogar() {
		return "Jogo individual";
	}

}