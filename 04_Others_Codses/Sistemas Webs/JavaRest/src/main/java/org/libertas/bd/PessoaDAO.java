package org.libertas.bd;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

public class PessoaDAO {
	public void inserir(Pessoa p) {
		Conexao con = new Conexao();
		try {
			String sql = "INSERT INTO pessoas"
					+ "(nome, telefone, idade) VALUES (?, ?, ?)";
			PreparedStatement prep = con.getConnection().prepareStatement(sql);
			prep.setString(1, p.getNome());
			prep.setString(2, p.getTelefone());
			prep.setInt(3, p.getIdade());
			prep.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.desconectar();
	}
	public void alterar(Pessoa p) {
		Conexao con = new Conexao();
		try {
			String sql = "UPDATE pessoas"
					+ " SET nome =?, telefone = ?, idade = ? "
					+ "WHERE idpessoa = ? ";
			PreparedStatement prep = con.getConnection().prepareStatement(sql);
			prep.setString(1, p.getNome());
			prep.setString(2, p.getTelefone());
			prep.setInt(3, p.getIdade());
			
			prep.setInt(4, p.getIdpessoa());
			
			prep.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.desconectar();
		
	}
	public void excluir(Pessoa p) {
		Conexao con = new Conexao();
		try {
			String sql = " DELETE FROM pessoas "
					+ " WHERE idpessoa = ? ";
			PreparedStatement prep = con.getConnection().prepareStatement(sql);
			prep.setInt(1, p.getIdpessoa());
			
			prep.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.desconectar();
		
	}

	public Pessoa consultar(int id) {

		Pessoa p = new Pessoa();
		Conexao con = new Conexao();
		try {
			String sql = "SELECT * FROM pessoas WHERE idpessoa = " + id;
			Statement sta = con.getConnection().createStatement();
			ResultSet res = sta.executeQuery(sql);
			while (res.next()) {
				p.setIdpessoa(res.getInt("idpessoa"));
				p.setNome(res.getString("nome"));
				p.setTelefone(res.getString("telefone"));
				p.setIdade(res.getInt("idade"));
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.desconectar();
		return p;
	}
		
	public List<Pessoa> listar(){
		List<Pessoa> lista = new LinkedList<Pessoa>();
			Conexao con = new Conexao();
		
		try {
			String sql = "SELECT * FROM pessoas ORDER BY idpessoa";
			Statement sta = con.getConnection().createStatement();
			ResultSet res = sta.executeQuery(sql);
			while (res.next()) {
				Pessoa p = new Pessoa();
				p.setIdpessoa(res.getInt("idpessoa"));
				p.setNome(res.getString("nome"));
				p.setTelefone(res.getString("telefone"));
				p.setIdade(res.getInt("idade"));
				lista.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.desconectar();
		return lista;
	}
}

