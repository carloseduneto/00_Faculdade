package Ser_Humano;

public class _01_Piscar {
	private Boolean palpebra;
	
	public _01_Piscar() {
		
	}
	
	public void OlhoAberto() {
		palpebra = false;
		System.out.println("👀 Olho aberto...");
	}
	
	public void OlhoFechado() {
		palpebra = true;
		System.out.println("😉 Olho fechado");
	}

}
