package _01_Exercicio01;

import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Wanda Wanda_Maximoff = new Wanda("Wanda Maximoff", "Mágica", "Feiticeira Escarlate");
		Miranha Homem_Aranha = new Miranha("Peter Parker", "Lançar teia", "Homem Aranha");
		DoutorEstranho Dr_Estranho = new DoutorEstranho("Stephen Vincent Strange", "Mágica", "Dr. Estranho");
		CapitaMarvel capitaMarvel = new CapitaMarvel("Carol Danvers", "Força anormal", "Capitã Marvel");
		
		LinkedList<SuperHeroi> lista = new LinkedList<SuperHeroi>();
		lista.add(capitaMarvel);
		lista.add(Dr_Estranho);
		lista.add(Homem_Aranha);
		lista.add(Wanda_Maximoff);
		
		for (SuperHeroi e : lista) {
			System.out.println(e.usarPoder());
		}

	}

}
