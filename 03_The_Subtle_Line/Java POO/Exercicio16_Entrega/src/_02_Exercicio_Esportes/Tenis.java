package _02_Exercicio_Esportes;

public class Tenis extends EsporteIndividual{
	

	public Tenis(String nome, String equipamento) {
		super(nome, equipamento);
	}
	
	@Override
	public String jogar() {
		return "🎾 Jogando tênis!!!";
	}

}
