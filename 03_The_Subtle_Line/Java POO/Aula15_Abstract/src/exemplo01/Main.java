package exemplo01;

import java.util.LinkedList;

public class Main {

	public static void main(String args[]) {
		Chefe chefe01 = new Chefe("Jessica", 22, 12000);
		Comissionario comissario01 = new Comissionario("Antônia", 25, 1200, 2, 200);
		Producao producao01 = new Producao("Patrícia", 23, 3.99, 999);
		Horista horista01 = new Horista("João", 27, 12, 20);
		
		System.out.println(
				"Chefe ganha: R$" + chefe01.Ganha() +
				"\nComissionário ganha: R$" + comissario01.Ganha()+
				"\nProdução ganha: R$" + producao01.Ganha()+
				"\nHorista ganha: R$" + horista01.Ganha()
		
				
				);
		
		LinkedList<Empregado> lista = new LinkedList();
		lista.add(chefe01);
		lista.add(comissario01);
		lista.add(producao01);
		lista.add(horista01);
		
		for (Empregado e : lista) {
			System.out.println(e.Ganha());
		}
		
		
	}

}
