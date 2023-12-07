package SistemaDeCartao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.dao.TitularDAO;
import model.entiry.CartaoDeCredito;
import model.entiry.Titular;
import model.entiry.Transacao;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	//Fazer polimorfismo
	public static String leString() {
		Scanner input = new Scanner(System.in);
		//System.out.print(">> ");
		return input.nextLine();
	}
	
	//O emitir vai ficar aqui no Main
	//
	
	public static String leString2 (String mensagem) {
		String valor = JOptionPane.showInputDialog(null, mensagem);
		return valor;
	}
	
	
	
	public static void metodoConsultarTodos() {
		TitularDAO pessoaDAO01 = new TitularDAO();
		List<Titular> listaPessoas = pessoaDAO01.consultarTudo();
		if(!listaPessoas.isEmpty()) {
			String saida = "";
			saida += "Id\t"+"Nome\t"+"Cpf\n";
		for(Titular t : listaPessoas) {
			saida += t.getId()+"\t";
			saida += t.getNomeTitular()+"\t";
			saida += t.getDocumentoTitular() + "\n";
			}
		JOptionPane.showMessageDialog(null, new JTextArea(saida));
			}else{
				System.out.println("Não tem registros!!!");
		}
	}
	
	public static int menuCartao() {
		Scanner input = new Scanner(System.in);
		System.out.println("💳 MENU CARTÃO");
		System.out.println("1- Cadastrar usuário");
		System.out.println("2- Emitir Cartão");
		System.out.println("3- Emitir Cartão adicional");
		System.out.println("4- Efetuar Pagamento");
		System.out.println("5- Consultar Limite");
		System.out.println("6- Consultar Transações");
		System.out.println("7- Pagar Fatura");
		System.out.println("8- Consultar Usuários");
		System.out.println("9- Consultar Cartões");
		System.out.println("0- Sair");
		System.out.print("Digite: ");
		return input.nextInt();
	}
	
	

	public static void main(String[] args) {
		ArrayList<Titular> titulares = new ArrayList<Titular>(); 
		int opcao;
		
		do {
			opcao = menuCartao();
			switch (opcao) {
			case 1: {
				System.out.println(" ");
				//Cadastrar usuários
				System.out.print("Insira o nome do titular: ");
				String nome = leString();
				System.out.print("Insira o documento titular: ");
				String documento = leString();
				Titular novoTitular = new Titular(nome, documento);
				
				
				TitularDAO titularDAO01 = new TitularDAO();
				titularDAO01.inserir(novoTitular);
				
				System.out.println("\u001B[32m☑️ "+ nome + " cadastrado com sucesso!!! \u001B[0m");
				/*titulares.add(novoTitular);*/
				
				System.out.println("Usuários cadastrados:");
				for (Titular t : titulares) {
					System.out.println("\u001B[34m"+t.getNomeTitular()+"\u001B[0m");
				}
				System.out.println(" ");
			break;
			}
			
			case 2:{
				
				System.out.println("");
				
				/*int tamanho = titulares.size();*/
				
				/*if (tamanho > 0) {

				int indice = 1;
				System.out.println("Escolha o usuário para fazer o novo cadastro");
				for (Titular t : titulares) {
					
					System.out.println(indice + " - " + t.getNomeTitular());
					indice++;
				}
				*/
					metodoConsultarTodos();
					String idStr = leString2("Digite id: ");
					int intUsuario = Integer.parseInt(idStr);
				
				/*String usuario = leString();
				int intUsuario = Integer.parseInt(usuario) - 1;*/
				
				TitularDAO titularDAO01 = new TitularDAO();
				String nome = titularDAO01.consultarNome(intUsuario);
					
				Titular titular = new Titular();
				String limite = leString2("Insira o limite do cartão: ");
				Double doubleLimite = Double.parseDouble(limite);
				
				
				
				CartaoDeCredito cartao = titular.criarCartao(doubleLimite, intUsuario, nome);
				/*titular.setCartoes(cartao);*/
				
				/*for (CartaoDeCredito cartao1 : titular.getCartoes()) {
					System.out.println(cartao1.getNumeroCartao());
				}*/
				/*
				}else {
					System.out.println("\u001B[30;43m⚠️ Sem usuários cadastrados!!!\u001B[0m");
				}*/
				
				System.out.println(" ");
				
				break;
						
			}
			
			case 3:{
				metodoConsultarTodos();
				String idStr = leString2("Digite id: ");
				int intUsuario = Integer.parseInt(idStr);
				TitularDAO titularDAO01 = new TitularDAO();
				Titular titular = new Titular();
				String limite = leString2("Insira o limite do cartão: ");
				Double doubleLimite = Double.parseDouble(limite);
				String nomeAdicional = leString2("Insira o nome do dependente:");				
				CartaoDeCredito cartao = titular.criarCartao(doubleLimite, intUsuario, nomeAdicional);
				break;
			}
			
			case 4:{
				// Dados da tabela
		        Object[][] dados = {
		                {"Item 1", "Descrição 1"},
		                {"Item 2", "Descrição 2"},
		                {"Item 3", "Descrição 3"}
		        };
		        String[] colunas = {"Item", "Descrição"};

		        // Configuração do estilo minimalista
		        UIManager.put("Table.gridColor", Color.LIGHT_GRAY);
		        UIManager.put("Table.font", new Font("Arial", Font.PLAIN, 12));
		        UIManager.put("Table.background", Color.WHITE);
		        UIManager.put("Table.selectionBackground", Color.LIGHT_GRAY);
		        UIManager.put("Table.selectionForeground", Color.BLACK);

		        // Criação da janela JDialog
		        JDialog dialog = new JDialog();
		        dialog.setTitle("Janela Personalizada com Tabela Minimalista");
		        dialog.setSize(400, 300);
		        dialog.setModal(true);

		        // Criação de um painel para conter os componentes
		        JPanel panel = new JPanel(new BorderLayout());

		        // Criação do modelo da tabela
		        DefaultTableModel tableModel = new DefaultTableModel(dados, colunas) {
		            @Override
		            public boolean isCellEditable(int row, int column) {
		                return false; // Impede a edição das células
		            }
		        };

		        // Criação da tabela com o modelo personalizado
		        JTable table = new JTable(tableModel);
		        table.setRowHeight(20); // Altura das linhas
		        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12)); // Fonte do cabeçalho
		        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
		            @Override
		            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
		                                                           boolean hasFocus, int row, int column) {
		                Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		                cellComponent.setBackground(row % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY); // Cor das linhas alternadas
		                return cellComponent;
		            }
		        });

		        JScrollPane scrollPane = new JScrollPane(table);
		        scrollPane.setPreferredSize(new Dimension(300, 150));
		        panel.add(scrollPane, BorderLayout.CENTER);

		        // Criação de um campo de texto para o input
		        JTextField textField = new JTextField();
		        panel.add(textField, BorderLayout.SOUTH);

		        // Criação de um botão para confirmar o input
		        JButton confirmButton = new JButton("OK");
		        confirmButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String input = textField.getText();
		                JOptionPane.showMessageDialog(dialog, "Input: " + input);
		                dialog.dispose();
		            }
		        });
		        panel.add(confirmButton, BorderLayout.EAST);

		        // Adiciona o painel à janela
		        dialog.add(panel);

		        // Exibe a janela
		        dialog.setVisible(true);


				/*	metodoConsultarTodos();
				String idStr = leString2("Digite id: ");
				int intUsuario = Integer.parseInt(idStr);
				
				
				
				
				
				
				
				
				System.out.println(" ");
				int indice = 1;
				System.out.println("Escolha o usuário que fará o pagamento: ");
				for (Titular t : titulares) {
					
					System.out.println(indice + " - " + t.getNomeTitular());
					indice++;
				}
				
				String usuario = leString();
				int intUsuario = Integer.parseInt(usuario) - 1;
				
				Titular titular = titulares.get(intUsuario);
				
				System.out.println("Qual cartão será usado para fazer o pagamento?");
				
				System.out.println("Opção \t Número \t\t Limite \t Validade \t Usuário");
				
				List<CartaoDeCredito> cartoes = titular.getCartoes();
				int tamanho = cartoes.size();

				for (int i = 0; i < tamanho; i++) {
					if (i<=0) {
				    CartaoDeCredito cartao = cartoes.get(i);
				    System.out.println(i+1 + "\t"+
				    					cartao.getNumeroCartao() + "\t" +
				                       cartao.getLimiteCredito() + "\t\t" +
				                       cartao.getDataValidade() + "\t" +
				                       titular.getNomeTitular()
				    		);
					}else {
						CartaoDeCredito cartao = cartoes.get(i);
					    System.out.println(i+1 + "\t"+
					    				   cartao.getNumeroCartao() + "\t" +
					                       cartao.getLimiteCredito() + "\t\t" +
					                       cartao.getDataValidade() + "\t"+ 
					                       cartao.getNomeAdicional()
					    		);	
					}
					
				}
				
				System.out.print(">>");
				String cartao = leString();
				int intCartao = Integer.parseInt(cartao) - 1;
				CartaoDeCredito cartao2 = cartoes.get(intCartao);
				
				System.out.print("Valor da transação: ");
				String valor = leString();
				double doubleValor = Double.parseDouble(valor);
				
				System.out.print("Estabelecimento: ");
				String estabelecimento = leString();
				
				cartao2.realizarTransacao(doubleValor, estabelecimento);
				
				List<Transacao> transacoes = cartao2.getTransacao();
			
				System.out.println("Estabelecimento \t\t Valor");
				for (Transacao transacoes1 : transacoes) {
					System.out.println(transacoes1.getEstabelecimento() + "\t\t" +
							transacoes1.getValor()			
							
							);
				}*/
				break;
				
			}
			
			case 5:{
				System.out.println(" ");
				int indice = 1;
				System.out.println("Escolha o usuário para exibir cartões cadastrados");
				for (Titular t : titulares) {
					
					System.out.println(indice + " - " + t.getNomeTitular());
					indice++;
				}
				String usuario = leString();
				int intUsuario = Integer.parseInt(usuario) - 1;
				
				Titular titular = titulares.get(intUsuario);
				
				System.out.println("Limites");
				
				System.out.println("Usuário \t Limite");
				
				List<CartaoDeCredito> cartoes = titular.getCartoes();
				int tamanho = cartoes.size();

				for (int i = 0; i < tamanho; i++) {
					if (i<=0) {
				    CartaoDeCredito cartao = cartoes.get(i);
				    System.out.println(titular.getNomeTitular() + "\t" +
				                       cartao.getLimiteCredito() 
				                       );
					}else {
						CartaoDeCredito cartao = cartoes.get(i);
					    System.out.println(cartao.getNomeAdicional() + "\t" +
					    		cartao.getLimiteCredito()
					                       
					    		);	
					}
					
				}
				
				System.out.println(" ");
				break;
			}
			
			case 6:{
				System.out.println(" ");
				int indice = 1;
				System.out.println("Escolha o usuário para consultar as transações: ");
				for (Titular t : titulares) {
					
					System.out.println(indice + " - " + t.getNomeTitular());
					indice++;
				}
				
				String usuario = leString();
				int intUsuario = Integer.parseInt(usuario) - 1;
				
				Titular titular = titulares.get(intUsuario);
				
				System.out.println("Consultar trasações de qual cartão?");
				
				System.out.println("Opção \t Número \t\t Limite \t Validade \t Usuário");
				
				List<CartaoDeCredito> cartoes = titular.getCartoes();
				int tamanho = cartoes.size();

				for (int i = 0; i < tamanho; i++) {
					if (i<=0) {
				    CartaoDeCredito cartao = cartoes.get(i);
				    System.out.println(i+1 + "\t"+
				    					cartao.getNumeroCartao() + "\t" +
				                       cartao.getLimiteCredito() + "\t\t" +
				                       cartao.getDataValidade() + "\t" +
				                       titular.getNomeTitular()
				    		);
					}else {
						CartaoDeCredito cartao = cartoes.get(i);
					    System.out.println(i+1 + "\t"+
					    				   cartao.getNumeroCartao() + "\t" +
					                       cartao.getLimiteCredito() + "\t\t" +
					                       cartao.getDataValidade() + "\t"+ 
					                       cartao.getNomeAdicional()
					    		);	
					}
					
				}
				
				System.out.print(">>");
				String cartao = leString();
				int intCartao = Integer.parseInt(cartao) - 1;
				CartaoDeCredito cartao2 = cartoes.get(intCartao);
				
				
				
				List<Transacao> transacoes = cartao2.getTransacao();
			
				System.out.println("Estabelecimento \t\t Valor");
				for (Transacao transacoes1 : transacoes) {
					System.out.println(transacoes1.getEstabelecimento() + "\t\t" +
							transacoes1.getValor()			
							
							);
				}
				break;
			}
			
			case 7:{
				System.out.println(" ");
				int indice = 1;
				System.out.println("Escolha o usuário para pagar a fatura: ");
				for (Titular t : titulares) {
					
					System.out.println(indice + " - " + t.getNomeTitular());
					indice++;
				}
				
				String usuario = leString();
				int intUsuario = Integer.parseInt(usuario) - 1;
				
				Titular titular = titulares.get(intUsuario);
				
				System.out.println("Pagar a fatura de qual cartão?");
				
				System.out.println("Opção \t Número \t\t Limite \t Validade \t Usuário");
				
				List<CartaoDeCredito> cartoes = titular.getCartoes();
				int tamanho = cartoes.size();

				for (int i = 0; i < tamanho; i++) {
					if (i<=0) {
				    CartaoDeCredito cartao = cartoes.get(i);
				    System.out.println(i+1 + "\t"+
				    					cartao.getNumeroCartao() + "\t" +
				                       cartao.getLimiteCredito() + "\t\t" +
				                       cartao.getDataValidade() + "\t" +
				                       titular.getNomeTitular()
				    		);
					}else {
						CartaoDeCredito cartao = cartoes.get(i);
					    System.out.println(i+1 + "\t"+
					    				   cartao.getNumeroCartao() + "\t" +
					                       cartao.getLimiteCredito() + "\t\t" +
					                       cartao.getDataValidade() + "\t"+ 
					                       cartao.getNomeAdicional()
					    		);	
					}
					
				}
				
				System.out.print(">>");
				String cartao = leString();
				int intCartao = Integer.parseInt(cartao) - 1;
				CartaoDeCredito cartao2 = cartoes.get(intCartao);
				
				
				double valorLimite = cartao2.getLimiteCredito();
				
				
				List<Transacao> transacoes = cartao2.getTransacao();
				double fatura = 0;
				System.out.println("Estabelecimento \t\t Valor");
				for (Transacao transacoes1 : transacoes) {
					System.out.println(transacoes1.getEstabelecimento() + "\t\t" +
							transacoes1.getValor());
				fatura += transacoes1.getValor();
				}
				
				System.out.println("Deseja pagar a fatura? ");
				System.out.println("\u001B[32m1- SIM\u001B[0m \t 2- NÃO");
				String opcaoCartao = leString();
				int intOpcaoCartao = Integer.parseInt(opcaoCartao);
				if(intOpcaoCartao == 1) {
					valorLimite += fatura;
					cartao2.setLimiteCredito(valorLimite);
					cartao2.getTransacao().clear();
					System.out.println("Fatura paga...");
				}else {
					System.out.println("Reiniciando...");
				}
				break;
			}
			
			case 8:{
				System.out.println(" ");
				System.out.println("Usuários cadastrados:");
				for (Titular t : titulares) {
					System.out.println("\u001B[34m"+t.getNomeTitular()+"\u001B[0m");
				}
				System.out.println(" ");
				break;
			}
			
			case 9:{
				System.out.println(" ");
				int indice = 1;
				System.out.println("Escolha o usuário para exibir cartões cadastrados");
				for (Titular t : titulares) {
					
					System.out.println(indice + " - " + t.getNomeTitular());
					indice++;
				}
				String usuario = leString();
				int intUsuario = Integer.parseInt(usuario) - 1;
				
				Titular titular = titulares.get(intUsuario);
				
				System.out.println("Opção \t Número \t\t Limite \t Validade \t Usuário");
				
				List<CartaoDeCredito> cartoes = titular.getCartoes();
				int tamanho = cartoes.size();

				for (int i = 0; i < tamanho; i++) {
					if (i<=0) {
				    CartaoDeCredito cartao = cartoes.get(i);
				    System.out.println(i+1 + "\t"+
				    					cartao.getNumeroCartao() + "\t" +
				                       cartao.getLimiteCredito() + "\t\t" +
				                       cartao.getDataValidade() + "\t" +
				                       titular.getNomeTitular()
				    		);
					}else {
						CartaoDeCredito cartao = cartoes.get(i);
					    System.out.println(i+1 + "\t"+
					    				   cartao.getNumeroCartao() + "\t" +
					                       cartao.getLimiteCredito() + "\t\t" +
					                       cartao.getDataValidade() + "\t"+ 
					                       cartao.getNomeAdicional()
					    		);	
					}
					
				}
				
				System.out.println(" ");
				break;
			}
			
			default:
				System.out.println("Opção inválida!!!");
			}
			
		
			
		} while (opcao != 0);

	}

}

