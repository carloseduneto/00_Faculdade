package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import model.dao.ConectaBD;
import model.dao.PessoaDAO;
import model.dao.ProdutoDAO;
import model.entiry.Pessoa;
import model.entiry.Veiculo;

public class App {
	public static String leString (String mensagem) {
		String valor = JOptionPane.showInputDialog(null, mensagem);
		return valor;
	}
	
	
	
	
	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1- Pessoa");
		System.out.println("2- Produto");
		System.out.println("0- Sair");
		System.out.print("Digite: ");
		return input.nextInt();
	}
	
	
	
	public static int menuProduto() {
		Scanner input = new Scanner(System.in);
		System.out.println("MENU PRODUTO");
		System.out.println("1- Inserir");
		System.out.println("2- Listar todos");
		System.out.println("3- Listar por id");
		System.out.println("4- Excluir por id");
		System.out.println("5- Atualizar");
		System.out.println("6- Sair");
		System.out.print("Digite: ");
		return input.nextInt();
	}
	
	
	public static int menuPessoa() {
		Scanner input = new Scanner(System.in);
		System.out.println("MENU PESSOA");
		System.out.println("1- Inserir");
		System.out.println("2- Listar todos");
		System.out.println("3- Listar por id");
		System.out.println("4- Excluir por id");
		System.out.println("5- Atualizar");
		System.out.println("6- Sair");
		System.out.print("Digite: ");
		return input.nextInt();
	}
	
	public static void metodoInserir() {
		String nome = leString("Digite o nome: ");
		String email = leString("Digite o email: ");
		Pessoa pessoa01 = new Pessoa(nome, email);
		PessoaDAO pessoaDAO01 = new PessoaDAO();
		pessoaDAO01.inserir(pessoa01);
	}
	
	public static void metodoInserirProduto() {
		String numeroChassi = leString("Digite o número Chassi: ");
		String placa = leString("Digite o número da placa: ");
		String modelo = leString("Digite o modelo: ");
		String marca = leString("Digite a marca: ");
		String valor = leString("Digite o valor: ");
		double doubleValor = Double.parseDouble(valor);
		Veiculo veiculo01 = new Veiculo(numeroChassi, placa, modelo, marca, doubleValor);
		
		ProdutoDAO produto01 = new ProdutoDAO();
		produto01.inserir(veiculo01);
	}
	
			
	public static void metodoExcluir() {
		String strId = leString("Digite o id: ");
		int id = Integer.parseInt(strId);
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.excluir(id);
		if(pessoa.getId()!= 0) {			
			System.out.println("Usuário " + pessoa.getNome() + " deletado.");
		}
	}
	
	public static void metodoExcluirPoduto() {
		String strId = leString("Digite o id: ");
		int id = Integer.parseInt(strId);
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Veiculo veiculo = produtoDAO.excluir(id);
		if(veiculo.getId()!= 0) {			
			System.out.println("Veículo, modelo " + veiculo.getModelo() + " deletado.");
		}
	}

	public static void metodoAtualizarVeiculo() {		
		String StrId = leString("Digite o id a ser atualizado: ");
		String numeroChassi = leString("Digite o número Chassi: ");
		String placa = leString("Digite o número da placa: ");
		String modelo = leString("Digite o modelo: ");
		String marca = leString("Digite a marca: ");
		String Strvalor = leString("Digite o valor: ");
		int id = Integer.parseInt(StrId);
		double valor = Double.parseDouble(Strvalor);
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Veiculo veiculo = produtoDAO.atualizarCarro(id, numeroChassi, placa, modelo, marca, valor);
		if(veiculo.getNumeroChassi()!=null) {
			String texto = "☑️ Modelo " + veiculo.getModelo() + " atualizado com sucesso!!!.";
			JOptionPane.showMessageDialog(null, new JTextArea(texto));
		}else {
			String texto = "Registro não encontrado";
			JOptionPane.showMessageDialog(null, new JTextArea(texto));
		}
	}
	
	public static void metodoAtualizar() {		
		String StrId = leString("Digite o id a ser atualizado: ");
		String nome = leString("Digite o nome: ");
		String email = leString("Digite o email: ");
		int id = Integer.parseInt(StrId);
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.atualizar(id, nome, email);
		if(pessoa.getNome()!=null) {
			String texto = "☑️ Usuário " + pessoa.getNome() + " atualizado com sucesso!!!.";
			JOptionPane.showMessageDialog(null, new JTextArea(texto));
		}else {
			String texto = "Registro não encontrado";
			JOptionPane.showMessageDialog(null, new JTextArea(texto));
		}
	}
		
		
	public static void metodoConsultarTodos() {
		PessoaDAO pessoaDAO01 = new PessoaDAO();
		List<Pessoa> listaPessoas = pessoaDAO01.consultarTudo();
		if(!listaPessoas.isEmpty()) {
			String saida = "";
			saida += "Id\t"+"Nome\t"+"Email\n";
		for(Pessoa p : listaPessoas) {
			saida += p.getId()+"\t";
			saida += p.getNome()+"\t";
			saida += p.getEmail() + "\n";
			}
		JOptionPane.showMessageDialog(null, new JTextArea(saida));
			}else{
				System.out.println("Não tem registros!!!");
		}
	}
	
	public static void metodoConsultarTodosProdutos() {
		ProdutoDAO produtoDAO01 = new ProdutoDAO();
		List<Veiculo> listaVeiculos = produtoDAO01.consultarTudo();
		if(!listaVeiculos.isEmpty()) {
			String saida = "";
			saida += "Id\t"+"Chassi\t"+"Placa\t"+"Modelo\t"+"Marca\t"+"Valor\n" ;
		for(Veiculo v : listaVeiculos) {
			saida += v.getId()+"\t";
			saida += v.getNumeroChassi()+"\t";
			saida += v.getPlaca()+"\t";
			saida += v.getModelo()+"\t";
			saida += v.getMarca()+"\t";
			saida += v.getValor() + "\n";
			}
		JOptionPane.showMessageDialog(null, new JTextArea(saida));
			}else{
				System.out.println("Não tem registros!!!");
		}
	}
	
	public static Veiculo metodoConsultaPlaca(){
		String placa = leString("Consultar Placas: ");
	     
        ProdutoDAO dao = new ProdutoDAO();
        Veiculo v = dao.consultarPlaca(placa);
        String saida = v.getMarca();
        JOptionPane.showMessageDialog(null, new JTextArea(saida));
		return v;
		
	}
	
	public static void main(String args[]) {
		
		System.out.println("Conectando");
		ConectaBD con = new ConectaBD();
		System.out.println("Conectou irmão");
		int op;
		
		
		do {
			op = menu();
		switch(op) {
		case 1:{
			do {
				op = menuPessoa();
			switch (op) {
			case 1: {
				metodoInserir();
				break;
			}
			case 2: {
				metodoConsultarTodos();
				break;
			}
			case 3: {
				String idStr = leString("Digite id: ");
				int id = Integer.parseInt(idStr);
				PessoaDAO dao = new PessoaDAO();
				Pessoa pess = dao.consultar(id);
				String saida;
				if (pess != null) {
					saida = "id\tnome\temail\n";
					saida += pess.getId() + "\t";
					saida = saida + pess.getNome() + "\t";
					saida += pess.getEmail() + "\n";
				}else {
					saida = "Registro não foi encontrado";
				}
				JOptionPane.showMessageDialog(null, new JTextArea(saida));
				
				break;
			}
			
			case 4:{
				metodoExcluir();
				break;
			}
			case 5:{
				metodoAtualizar();
				break;
			}
			case 6: {
				System.out.println("Saindo...");
				break;
			}
			
			default:
				System.out.println("Opção inválida!!!");
			}
			} while(op!=6);
			break;
			}
		
		case 2:{
			do {
				op = menuProduto();
				switch (op) {
				case 1: {
					metodoInserirProduto();
					break;
				}
				case 2:{
					metodoConsultarTodosProdutos();
					break;
				}
				
				case 3:{
					String idStr = leString("Digite id: ");
					int id = Integer.parseInt(idStr);
					ProdutoDAO dao = new ProdutoDAO();
					Veiculo veiculo = dao.consultar(id);
					String saida = null;
					if (veiculo != null) {
						saida += "Id\t"+"Chassi\t"+"Placa\t"+"Modelo\t"+"Marca\t"+"Valor\n" ;
						saida += veiculo.getId()+"\t";
						saida += veiculo.getNumeroChassi()+"\t";
						saida += veiculo.getPlaca()+"\t";
						saida += veiculo.getModelo()+"\t";
						saida += veiculo.getMarca()+"\t";
						saida += veiculo.getValor() + "\n";
					}else {
						saida = "Registro não foi encontrado";
					}
					JOptionPane.showMessageDialog(null, new JTextArea(saida));
					
					break;
				}
				
				
				case 4:{
					metodoExcluirPoduto();
					break;
				}
				
				case 5:{
					metodoAtualizarVeiculo();
				}
				
				case 6:{
					metodoConsultaPlaca();
				break;
				}
				case 0:{
					System.out.println("Saindo...");
				}
				
				default:
					System.out.println("Opção inválida!!!");
				}
			} while (op != 0);
		}
		
		case 0:{
			System.out.println("Saindo...");
		}
		default:
			System.out.println("Opção inválida!!!");
		}
		
		
		
		} while (op!=0);
		
		
		
		
	}
	
	/*public static void main(String[] args) {
		
		//pessoa01.inserir();
	
		//pessoaDAO01.consultarTudo();
		List<Pessoa> listaPessoas = pessoaDAO01.consultarTudo();
		System.out.println("\033[30m" + "Id\t"+"Nome\t\t"+"Email\033[0m");
		for(Pessoa p : listaPessoas) {
			System.out.print(p.getId()+"\t");
			System.out.print(p.getNome()+"\t");
			System.out.println(p.getEmail());
		}
	}*/

}
