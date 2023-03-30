package Empresa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario novoFuncionario = new Funcionario("Alexandre","Programador", 350.00, 40.00 , 0.15 );
		novoFuncionario.setSalarioMinimo();
		novoFuncionario.setComissao();
		novoFuncionario.setVendas();
		
		System.out.println("Nome: " + novoFuncionario.getNome() +
						   "\nCargo: " + novoFuncionario.getCargo() +
						   "\nSalário: " + novoFuncionario.getSalario() +
						   "\nComissão: " + novoFuncionario.getComissao()
				);
	}

}
