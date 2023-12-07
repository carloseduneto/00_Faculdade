package _01_Ovos_De_Pascoa;

import java.util.ArrayList;
import java.util.List;

public class MainChocolate {
	
	public static void print(Object linha) {
		System.out.println(linha);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate chocolate1 = new Chocolate("Ao Leite");
		Chocolate chocolate2 = new Chocolate("50% Amargo");
		Chocolate chocolate3 = new Chocolate("Amargo");
		
		Marca marca1 = new Marca("Garoto");
		Marca marca2 = new Marca("Hershey's'");
		
		marca1.adicionarChocolate(chocolate1);
		marca1.adicionarChocolate(chocolate2);
		
		marca2.adicionarChocolate(chocolate1);
		marca2.adicionarChocolate(chocolate2);
		marca2.adicionarChocolate(chocolate3);
		
		print(marca1.getNome());
		
		List<Marca> marcas = new ArrayList<>();
		marcas.add(marca1);
		marcas.add(marca2);
		
		for (Marca marca : marcas) {
			print("Marca "+ marca.getNome());
			print("Chocolates: ");
			for (Chocolate chocolate : marca.getChocolate()) {
				print(chocolate.getSabor());
				
			}
			print("");
		}
	}

}
