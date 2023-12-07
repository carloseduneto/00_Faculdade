package Exercicio01_V2;

public class ItemPedido {
	private String nomeProduto;
	private int quantidade;
	
	public ItemPedido(String nomeProduto, int quantidade) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
	}
	
	

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
