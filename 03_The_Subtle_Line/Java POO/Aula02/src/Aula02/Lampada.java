package Aula02;

public class Lampada {
	String estado;
	//método == void
	void acenderLuz () {
		estado= "Acesso";
		
	}
	
	void meiaLuz () {
		estado = "Meia luz";
	}
	
	void apagarLuz () {
		estado = "Luz apagada";
}
	String retornaEstado() {
		return estado;
	}
}
