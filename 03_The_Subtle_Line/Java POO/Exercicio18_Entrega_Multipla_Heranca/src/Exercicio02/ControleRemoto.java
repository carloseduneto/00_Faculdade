package Exercicio02;

public interface ControleRemoto {
	public int volumePadrao = 60;
	public void AumentaVolume(int taxa);
	public void DiminiuVolume(int taxa);
	boolean Ligar();
	boolean Desligar();
	

}
