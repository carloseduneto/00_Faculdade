package _02_PostIt_Texto;

import java.util.ArrayList;
import java.util.List;

public class MainPostIt {
	public static void print(Object linha) {
		System.out.println(linha);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cor amarelo = new Cor("amarelo");
		Cor verde = new Cor("verde");
		Cor azul = new Cor("azul");
		
		PostIt postIt01 = new PostIt("Não importa o futuro, importa o que vem daqui para frente", amarelo);
		PostIt postIt02 = new PostIt("Não há nada ruim que não pode piorar", verde);
		PostIt postIt03 = new PostIt("De mal a pior", azul);
		
		List<PostIt> postIts = new ArrayList<>();
		
		postIts.add(postIt01);
		postIts.add(postIt02);
		postIts.add(postIt03);
		
		for (PostIt post : postIts) {
			System.out.println(post.getCor().getNome().toUpperCase()+ " "  + post.getTexto());
		}
	}

}
