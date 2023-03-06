package Aula02;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1;
		//Pessoa é um tipo igual int para uma variável
		pessoa1 = new Pessoa();
		int x= 1;
		pessoa1.alteraNome("João Vinícius");
		pessoa1.alteraAltura(1.76);
		pessoa1.alteraPeso(80);
		System.out.println("Jão Vinícius: "+ pessoa1.retornaImc() );
				
	}

}
