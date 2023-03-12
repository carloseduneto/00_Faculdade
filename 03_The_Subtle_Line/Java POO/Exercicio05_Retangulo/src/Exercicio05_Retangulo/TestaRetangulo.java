package Exercicio05_Retangulo;

public class TestaRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangulo novoRetangulo = new Retangulo(100, 4);
		//novoRetangulo.lado1=10;
		//novoRetangulo.alteraLado2(5);
		novoRetangulo.calculaArea();
		novoRetangulo.calculaPerimetro();
		System.out.println(novoRetangulo.perimetroTotal());
		System.out.println(novoRetangulo.areaTotal());
		//novoRetangulo.alteraLado2(7);
		
		//novoRetangulo.calculaArea();
		//novoRetangulo.calculaPerimetro();
		//System.out.println(novoRetangulo.perimetroTotal());
		//System.out.println(novoRetangulo.areaTotal());
		
		
	}

}
