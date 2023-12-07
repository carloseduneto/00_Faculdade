package Prova;

public class Main {
	public static void print(Object linha) {
		System.out.println(linha);
	}
	
	public static void main(String[] args) {
		Time time01 = new Time("Portugal", "Líquido", "Vermelho e Verde");
		Time time02 = new Time("Guarani", "Gasoso", "Marrom e Preto Claro");
		
		Jogadores jogador01 = new Jogadores("João", "Artilheiro", 24);
		Jogadores jogador02 = new Jogadores("Rodrigo", "Zagueiro", 11);
		Jogadores jogador03 = new Jogadores("Gian", "Goleiro", 01);
		Jogadores jogador04 = new Jogadores("Felipe", "Volante", 6);
		Jogadores jogador05 = new Jogadores("Jorge", "Lateral", 33);
		Jogadores jogador06 = new Jogadores("Leide", "Atacante", 34);
		Jogadores jogador07 = new Jogadores("Rafael", "Goleiro", 35);
		Jogadores jogador08 = new Jogadores("Amanda", "Artilheiro", 12);
		Jogadores jogador09 = new Jogadores("Carlos", "Goleiro", 22);
		Jogadores jogador10 = new Jogadores("Jéssica", "Ativa", 69);
		
		time01.adcionarJogaodor(jogador01);
		time01.adcionarJogaodor(jogador02);
		time01.adcionarJogaodor(jogador03);
		time01.adcionarJogaodor(jogador04);
		time01.adcionarJogaodor(jogador05);
		
		time02.adcionarJogaodor(jogador06);
		time02.adcionarJogaodor(jogador07);
		time02.adcionarJogaodor(jogador08);
		time02.adcionarJogaodor(jogador09);
		time02.adcionarJogaodor(jogador10);
		
		for (Jogadores jogador : time01.getJogador()) {
			print("Time: "+time01.getNome());
			print("Jogador: "+jogador.getNome());
			print("Posição: "+jogador.getPosicao());
			print("Número camisa: "+jogador.getNumeroCamisa());
			print("*********************************");
		}
		
		print(" ");
		
		for (Jogadores jogador : time02.getJogador()) {
			print("Time: "+time01.getNome());
			print("Jogador: "+jogador.getNome());
			print("Posição: "+jogador.getPosicao());
			print("Número camisa: "+jogador.getNumeroCamisa());
			print("*********************************");
		}
		
		
	}

}
