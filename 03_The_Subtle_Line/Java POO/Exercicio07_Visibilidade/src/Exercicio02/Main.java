package Exercicio02;

public class Main {

	public static void main(String[] args) {
		Consulta novaConsulta1 = new Consulta("Alexandre", "98732-1212");
		
		novaConsulta1.novaDataConsulta("27/03/2024");
		novaConsulta1.novaDataRetorno("29/03/2024");
		novaConsulta1.novoMedico("Dr. Sérgio");
		novaConsulta1.registrarSintomas("Dor de cabeça, febre e enjoo");
		System.out.println(
				"Nome: "+novaConsulta1.retornaNome()+
				"\nData consulta: " + novaConsulta1.retornaDataConsulta()+
				"\nMédico: "+ novaConsulta1.retornaMedico() +
				"\nData retorno: " + novaConsulta1.retornaDataRetorno()+
				"\nSintomas: "+ novaConsulta1.retornaSintomas()+
				"\n--------------------"
				);
		
		Consulta novaConsulta2 = new Consulta("Cláudia", "98231-1431");
		novaConsulta2.novaDataConsulta("21/07/2024");
		novaConsulta2.novaDataRetorno("29/03/2025");
		novaConsulta2.novoMedico("Dra. Juliana");
		novaConsulta2.registrarSintomas("Manchas pelo corpo e coceira");
		System.out.println(
				"Nome: "+novaConsulta2.retornaNome()+
				"\nData consulta: " + novaConsulta2.retornaDataConsulta()+
				"\nMédico: "+ novaConsulta2.retornaMedico() +
				"\nData retorno: " + novaConsulta2.retornaDataRetorno()+
				"\nSintomas: "+ novaConsulta2.retornaSintomas()
				);
	}

}
