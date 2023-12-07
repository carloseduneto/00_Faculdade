package _01_Introducao;

import dao.ConectaDB;
import dao.Pessoa;

public class App {

	public static void main(String[] args) {
		ConectaDB objetoConexao = new ConectaDB();
		Pessoa objeto01 = new Pessoa();
		
		objeto01.nome = "João VInícius";
		objeto01.email = "joaovi93@outlook.com";
		
		objetoConexao.inserir(objeto01);
	}

}
