package _01_Exemplo;

public class Main {

	public static void main(String[] args) {
		Nota provas01 = new Nota(8.9, 7.2);
		
		System.out.println("Prova 1 :"+provas01.getProva01());
		System.out.println("Prova 2 :"+provas01.getProva02());
		System.out.println("Média :"+ Nota.getMedia());

	}

}
