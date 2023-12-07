package _02_PostIt_Texto;

import java.util.ArrayList;

public class PostIt {
	private String texto;
	private Cor cor;
	
	public PostIt(String texto, Cor cor) {
		// TODO Auto-generated constructor stub
		this.texto = texto;
		this.cor = cor;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public Cor getCor(){
		return cor;
	}

}
