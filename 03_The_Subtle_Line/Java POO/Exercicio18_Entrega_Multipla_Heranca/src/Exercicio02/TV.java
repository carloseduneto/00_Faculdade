package Exercicio02;

public class TV {
	private int tamamho;
	private int canal;
	private int volume;
	private boolean ligado;
	
	public TV() {
		
	}
	
	public TV(int tamanho) {
		this.tamamho = tamanho;
	}

	public int getTamamho() {
		return tamamho;
	}

	public void setTamamho(int tamamho) {
		this.tamamho = tamamho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
