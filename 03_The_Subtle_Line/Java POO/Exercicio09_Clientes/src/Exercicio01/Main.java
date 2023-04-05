package Exercicio01;

public class Main {

		public main(String[] args) {
			 Clientes donald = new Clientes("Donald", "Rua Pimenta de Pádua, 1072", "(35) 1111-1111");
		        Clientes patinhas = new Clientes("Patinhas", "Rua Brideiro lima, 456", "(35) 2222-2222");

		        Pedido donaldPedido1 = new Pedido(1, "Pedido 1 do Donald", 100.0, donald);
		        Pedido donaldPedido2 = new Pedido(2, "Pedido 2 do Donald", 200.0, donald);
		        Pedido patinhasPedido1 = new Pedido(1, "Pedido 1 do Patinhas", 150.0, patinhas);
		        Pedido patinhasPedido2 = new Pedido(2, "Pedido 2 do Patinhas", 250.0, patinhas);
		        Pedido patinhasPedido3 = new Pedido(3, "Pedido 3 do Patinhas", 350.0, patinhas);

		    
		        
		        System.out.println("Pedidos do cliente Donald");
		        for (Pedido pedido : donald.getPedidos()) {
		            System.out.println("Número do pedido: " + pedido.getNumero());
		            System.out.println("Descrição do pedido: " + pedido.getDescricao());
		            System.out.println("Valor total do pedido: " + pedido.getValotTotal());
		            System.out.println();
		        }
		        
		        System.out.println();

		        System.out.println("Pedidos do cliente Patinhas");
		        for (Pedido pedido : patinhas.getPedidos()) {
		            System.out.println("Número do pedido: " + pedido.getNumero());
		            System.out.println("Descrição do pedido: " + pedido.getDescricao());
		            System.out.println("Valor total do pedido: " + pedido.getValotTotal());
		            System.out.println();
		        }
		}
	}
