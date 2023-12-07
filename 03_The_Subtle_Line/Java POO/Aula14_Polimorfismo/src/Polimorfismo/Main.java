package Polimorfismo;

public class Main {
	public static void print(Object linha) {
		System.out.println(linha);
	}
	
	public static void main(String[] args) {
		Calculadora soma01 = new  Calculadora();
		
		print(soma01.somar(66, 69));
		print(soma01.somar(2, 7, 2, 7, 1));
		print(soma01.somar(3.5845186186598658, 5.145552511111111111111));

	}

}
