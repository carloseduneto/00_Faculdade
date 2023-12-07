package Exercicio01_V2;

import java.util.ArrayList;
import java.util.List;

/*
Exercicio 01
• Desenvolva uma aplicação em Java. utilizando os
conceitos da POO. para cadastro e controle de
Clientes e seus Pedidos. ondei
• um Cliente pode ler zero, um ou muitos Pedidos
• um Pedido e de um úmco Cliente
• Desenvolva uma classe principal contendo o
método para testar o programa.
• Cliente Donald fez 2 pedidos
• Cliente Patinhas fez 3 pedidos
*/



public class MainExercicio01 {

	static void print(Object linha) {
		System.out.println(linha);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*List<String> lista = new ArrayList<>();
		 
		 lista.add("Item 1");
	     lista.add("Item 2");
	     lista.add("Item 3");

	     print(lista);
	     
	     for (String item : lista) {
	    	 print(item);
		  */
		
		Cliente donald = new Cliente("Donald Pato", 1);
		Cliente patinhas = new Cliente("Tio Patinhas", 2);
		
		Pedido pedido1 = new Pedido("Desodorante", 1);
		Pedido pedido2 = new Pedido("Escova de dentes", 1);
		
		
		Pedido pedido3 = new Pedido("Creme dental", 1);
		Pedido pedido4 = new Pedido("Fio dental", 1);
		Pedido pedido5 = new Pedido("Shampoo", 1);
		
		
		donald.adicionarPedido(pedido1);
		donald.adicionarPedido(pedido1);
		
		
		patinhas.adicionarPedido(pedido3);
		patinhas.adicionarPedido(pedido4);
		patinhas.adicionarPedido(pedido5);
		
		
		print("AAA");
		print(donald.getPedidos());
		
		/*for(Pedido pedido : pedido1.ge) {
			print("Nome: " + item.getNomeProduto());
			print("Quantidade: " + item.getQuantidade());
		}*/
	     
	}

}

