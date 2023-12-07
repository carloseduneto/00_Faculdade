package _02_Exercicio_Esportes;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Futebol futebol = new Futebol("Futebol", 11);
		Volei volei = new Volei("Vôlei", 6);
		Tenis tenis = new Tenis("Tênis", "Raquete");
		
		Jogadores jogador01 = new Jogadores("João Vinícius", tenis);
		Jogadores jogador02 = new Jogadores("Jorge Henrique", futebol);
		Jogadores jogador03 = new Jogadores("Felipe Passagem", volei);
		
		LinkedList<Jogadores> lista = new LinkedList<>();
		lista.add(jogador01);
		lista.add(jogador02);
		lista.add(jogador03);
		
		for (Jogadores j : lista) {
			System.out.println("Nome: " + j.getNome() +
								"\nEsporte: "+ j.getEsporte().getNome()+ 
								"\nAção: "+ j.getEsporte().jogar()+
								"\n------------");
			
		}
	}

}
