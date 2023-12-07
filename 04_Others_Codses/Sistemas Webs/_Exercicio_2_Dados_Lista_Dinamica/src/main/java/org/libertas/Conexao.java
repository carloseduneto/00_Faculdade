package org.libertas;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private Connection connection;

	public Conexao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(
					"jdbc:mysql://69.49.241.46:3306/"
					+ "mikae731_Aula_ely?verifyServerCertificate=false&useSSL=false",
					"mikae731_Aula_ely", "Paraiso2023@");
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	
		
	}
	
	public void desconectar(){
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
