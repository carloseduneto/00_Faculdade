package Exercicio01;

/*
 Exercicio 01
• Desenvolva uma aplicação em Java. utilizando os
conceitos da PCO. para cadastro e controle de
Clientes e seus Pedidos. ondei
• um Cliente pode ler zero. um ou murlos PedrdOS'
• um Pedido e de um úmco Clrente
• Oesenvolva uma classe principal contendo o
método para testar o programa.
• Cliente Donald fez 2 pedidos
• Cliente Patinhas fez 3 pedidos
 */



public class Main {

	static void print(Object linha) {
		System.out.println(linha);		
	}
		public static void main(String[] args) {
			 Clientes donald = new Clientes("Donald");
		        Clientes patinhas = new Clientes("Patinhas");

		        Pedido donaldPedido1 = new Pedido("Pedido 1 do Donald");
		        Pedido donaldPedido2 = new Pedido("Pedido 2 do Donald");
		        Pedido patinhasPedido1 = new Pedido("Pedido 1 do Patinhas");
		        Pedido patinhasPedido2 = new Pedido("Pedido 2 do Patinhas");
		        Pedido patinhasPedido3 = new Pedido("Pedido 3 do Patinhas");

		        donald.adicionarPedido(donaldPedido1);
		        donald.adicionarPedido(donaldPedido2);
		        
		        patinhas.adicionarPedido(patinhasPedido1);
		        patinhas.adicionarPedido(patinhasPedido2);
		        patinhas.adicionarPedido(patinhasPedido3);
		        
		        
		        
		        System.out.println("Pedidos do Donald:");
		        for (Pedido pedido : donald.getPedidos()) {
		            System.out.println(pedido.getDescricao());
		        }

		        System.out.println("Pedidos do Patinhas:");
		        for (Pedido pedido : patinhas.getPedidos()) {
		            System.out.println(pedido.getDescricao());
		        }
			
		}
	}
