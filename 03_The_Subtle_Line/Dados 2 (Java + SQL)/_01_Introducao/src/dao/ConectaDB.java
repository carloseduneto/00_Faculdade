package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConectaDB {
	private Connection conexao;
	
	//Construtor
	public ConectaDB() {
		String bancoDados = "javasql";
		String url = "jdbc:mariadb://localhost:3306/"+bancoDados;
		String usuario= "root";
		String senha = "";
		try {
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("☑️ Conexão realizada!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void inserir(Pessoa p) {
		String sql = "INSERT INTO pessoa (nome, email) VALUES(?,?)";
		
		try {
			PreparedStatement prepararFrase = conexao.prepareStatement(sql);
			prepararFrase.setString(1, p.nome);
			prepararFrase.setString(2, p.email);
			prepararFrase.execute();
			System.out.println("✅ Adicionado com sucesso!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
