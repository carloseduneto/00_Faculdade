package _03_Fones_De_Ouvido;

public class Main_Fones {

	public static void print(String linha) {
		System.out.println(linha);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fone pulseMax = new Fone("Motorola", "Ear-on");
		Fone lenovoInOut = new Fone("Lenovo", "WPS");
		Fone e_Esport325 = new Fone("E-ESport", "Ear-over");
		
		Marca Motorola = new Marca("Motorola", "China", pulseMax);
		
		print(Motorola.getFone());
		
	}

}
