package org.libertas.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
private Connection  connection;

public Conexao() {
	try {
		
		System.out.println("conectando no server 3 69.49.241.46");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//abre conexão com o banco de dados
		connection = DriverManager.getConnection(
				"jdbc:mysql://69.49.241.46:3306/"
				+ "mikae731_Aula_ely?verifyServerCertificate=false&useSSL=false",
				"mikae731_Aula_ely", "Paraiso2023@");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void desconectar() {
	try {
		connection.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public Connection getConnection() {
	return connection;
}
}