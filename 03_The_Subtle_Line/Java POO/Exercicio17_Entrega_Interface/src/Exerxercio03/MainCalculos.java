package Exerxercio03;

public class MainCalculos {

	public static void main(String[] args) {
		OperacaoMatematica soma = new Adicao();
		System.out.println("1+4="+soma.Calcule(1, 4));
		
		OperacaoMatematica menos = new Subtracao();
		System.out.println("5-2="+menos.Calcule(5, 2));
		
		OperacaoMatematica vezes = new Multiplicacao();
		System.out.println("7*7="+vezes.Calcule(7, 7));
		
		OperacaoMatematica divide = new Divisao();
		System.out.println("30/5="+divide.Calcule(30, 5));

	}

}
