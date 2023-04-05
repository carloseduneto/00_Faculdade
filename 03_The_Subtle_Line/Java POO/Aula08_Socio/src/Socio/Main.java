package Socio;

public class Main {

	public static void main(String[] args) {
		Socio socio1 = new Socio("João Vinícius", "Rua Madrake, 69", "(35)98712-1234");
		Dependente dependente1 = new Dependente("Jéssica", 20, socio1);
		Dependente dependente2 = new Dependente("Cristiane", 26, socio1);
		
		Socio socio2 = new Socio("Eduarda", "Rua da Casa dela, 00", "(32)99881-2231");
		
		System.out.println(dependente1.getNome() + " seu sócio é: " + dependente1.getSocio().getNome());
		System.out.println(dependente2.getNome() + " seu sócio é: " + dependente2.getSocio().getNome());
		System.out.println("Sócio : " + socio1.getNome() + "/ Possui: "+ socio1.getDependentes().size() + " dependentes");
		

	}

}
