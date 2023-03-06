package Aula02;

public class Pessoa {
	String nome;
	double peso;
	double altura;
	String mensagem;
	
	
	void alteraNome(String novoNome) {
		nome = novoNome;
	}
	
	void alteraPeso (double novoPeso) {
		peso = novoPeso;
	}
	
	void alteraAltura (double novaAltura) {
		altura = novaAltura;
	}
	
	String retornaNome() {
		return nome;
	}
	
	double retornaPeso() {
		return peso;
	}
	
	double retornaAltura() {
		return altura;
	}
	
	String retornaImc() {
		double Imc= peso/(altura*altura);
		
		
		if (Imc < 18) {
			mensagem =Imc + " você está abaixo do peso.";
			
		}else if (Imc<=18 && Imc<=25) {
			mensagem = Imc + " você está no peso ideal.";
		
		}else if(Imc >25.0){
			mensagem = Imc + " você está acima do peso.";
		
		}
		return mensagem;
		
	}
	
	
}