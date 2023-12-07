package _01_Exemplo;

public class Main {
	public static void print(Object linha) {
		System.out.println(linha);
	}
	
	public static void main(String[] args) {
		Celular.setDolar(5.05);
		
		Celular celular01 = new Celular("Iphone 13", 4000);
		Celular celular02 = new Celular("Galaxy S20", 2000);
		
		print("Preço em reais R$ " + celular01.getPreco());
		print("Preço em dólares $ " + celular01.getPrecoEmDolar());
		
		print("Preço em reais R$ " + celular02.getPreco());
		print("Preço em dólares $ " + celular02.getPrecoEmDolar());
		
	}

}
