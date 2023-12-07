package org.libertas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class AnimalDAO {

	public AnimalDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void inserir(Animal a) {
		Conexao con = new Conexao();
		try {
			String sql = "INSERT INTO animais (nome, especie, raca) " +
		"VALUES (?, ?, ?)";
		
		PreparedStatement prep = con.getConnection().prepareStatement(sql);
		prep.setString(1, a.getNome());
		prep.setString(2, a.getEspecie());
		prep.setString(3, a.getRaca());
		prep.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.desconectar();
		}
	}
	
	public void alterar(Animal a) {
		Conexao con = new Conexao();
		try {
			String sql = "UPDATE animais "
					+ "SET nome= ?, especie=?, raca=? "
					+ "WHERE idanimal=?;";
		
		PreparedStatement prep = con.getConnection().prepareStatement(sql);
		prep.setString(1, a.getNome());
		prep.setString(2, a.getEspecie());
		prep.setString(3, a.getRaca());
		prep.setInt(4, a.getIdanimal());
		prep.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.desconectar();
		}
	}
	
	public void excluir(Animal a) {
		Conexao con = new Conexao();
		try {
			String sql = "DELETE FROM animais "
					+ "WHERE idanimal=?;";
		
		PreparedStatement prep = con.getConnection().prepareStatement(sql);
		prep.setInt(1, a.getIdanimal());
		prep.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.desconectar();
		}
	}
	
	public Animal consultar(int id) {
		Animal a = new Animal();
		Conexao con = new Conexao();
		try {
			String sql = "SELECT * FROM animais "
					+ "WHERE idanimal=?;";
		
		PreparedStatement prep = con.getConnection().prepareStatement(sql);
		prep.setInt(1, id);
		ResultSet res = prep.executeQuery();
			
			if (res.next()) {
				a.setIdanimal(res.getInt("idanimal"));
				a.setNome(res.getString("nome"));
				a.setEspecie(res.getString("especie"));
				a.setRaca(res.getString("raca"));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.desconectar();
		}
		return a;
	}
	
	public List<Animal> Listar() {
		List<Animal> lista = new LinkedList<Animal>();
		Conexao con = new Conexao();
		try {
			String sql = "SELECT * FROM animais ORDER BY idanimal";
		
		PreparedStatement prep = con.getConnection().prepareStatement(sql);
		ResultSet res = prep.executeQuery();
			
			while (res.next()) {
				Animal a = new Animal();
				a.setIdanimal(res.getInt("idanimal"));
				a.setNome(res.getString("nome"));
				a.setEspecie(res.getString("especie"));
				a.setRaca(res.getString("raca"));
				lista.add(a);
			}
			res.close();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.desconectar();
		}
		return lista;
	}
	

}
