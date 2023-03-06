package Calculadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcular Numeros= new Calcular();
		
		Numeros.alteraNumero1(22);
		Numeros.alteraOperador("+");
		Numeros.alteraNumero2(29);
		System.out.println(Numeros.resulucao());
	}

}
