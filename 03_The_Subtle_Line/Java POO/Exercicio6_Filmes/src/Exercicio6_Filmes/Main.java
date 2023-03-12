package Exercicio6_Filmes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AvaliarFilmes filme1 = new AvaliarFilmes();
		filme1.alteraNome("Atividade Paranormal");
		filme1.alteraAno("2002");
		filme1.alteraCategoria("Terror");
		filme1.alteraNota1(3);
		filme1.alteraNota2(5);
		filme1.alteraNota3(2);
		filme1.alteraNota4(1);
		filme1.alteraNota2(4);
		filme1.calculaMedia();
		System.out.println(filme1.retornaAvalicao());

		AvaliarFilmes filme2 = new AvaliarFilmes();
		filme2.alteraNome("Titanic");
		filme2.alteraAno("1998");
		filme2.alteraCategoria("Romace/ Drama");
		filme2.alteraNota1(5);
		filme2.alteraNota2(4);
		filme2.alteraNota3(3);
		filme2.alteraNota4(5);
		filme2.alteraNota5(2);
		filme2.calculaMedia();
		System.out.println(filme2.retornaAvalicao());
		
	
	}

}
