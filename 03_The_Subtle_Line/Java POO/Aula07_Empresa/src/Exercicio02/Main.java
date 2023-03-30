package Exercicio02;

public class Main {

	public static void main(String[] args) {
		Socio novoSocio01 = new Socio("João Vinícius", "Rua Francisco Duarte Filho, 425", "(35)98732-1203");
		Dependente novoDependente01 = new Dependente("Jéssica", 22, novoSocio01);
		Dependente novoDependente02 = new Dependente("Amanda", 24, novoSocio01);
		
		System.out.println(novoDependente01.getNome() + " truseu sócio é: "+
						  novoDependente01.getSocio().getNome()
				);

	}

}
