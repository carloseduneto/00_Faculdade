package Aula02;

public class Main {
	public static void main (String [] args) {
		Lampada lampada;
		lampada = new Lampada();
		
		lampada.acenderLuz();
		lampada.apagarLuz();
		System.out.println(lampada.retornaEstado());
		lampada.meiaLuz();
		System.out.println(lampada.retornaEstado());
		
		
	}
	
}
