package projeto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;



public class LojaRoupaDAO {

	public LojaRoupaDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void inserir(LojaRoupa roupa) {
		Conexao con = new Conexao();
		try {
			String sql = "INSERT INTO cadastro(descricao, preco, quantidade, categoria, tamanho)"+
					"VALUES(?, ?, ?, ?, ?);";
			PreparedStatement parametros = con.getConexao().prepareStatement(sql);
			parametros.setString(1, roupa.getDescricao());
			parametros.setDouble(2, roupa.getPreco());
			parametros.setInt(3, roupa.getQuantidade());
			parametros.setString(4, roupa.getCategoria());
			parametros.setString(5, roupa.getTamanho());
			parametros.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.desconectar();
		}	
			
	}
	
	public void alterar(LojaRoupa roupa) {
		Conexao con = new Conexao();
		try {
			String sql = "UPDATE cadastro "
					+ "SET descricao= ?, preco=?, quantidade=?, categoria=?, tamanho=? "
					+ "WHERE id=?;";
		
			PreparedStatement parametros = con.getConexao().prepareStatement(sql);
			parametros.setString(1, roupa.getDescricao());
			parametros.setDouble(2, roupa.getPreco());
			parametros.setInt(3, roupa.getQuantidade());
			parametros.setString(4, roupa.getCategoria());
			parametros.setString(5, roupa.getTamanho());
			parametros.setInt(6, roupa.getId());
			parametros.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.desconectar();
		}
	}
	
	public void excluir(LojaRoupa roupa) {
		Conexao con = new Conexao();
		try {
			String sql = "DELETE FROM cadastro "
					+ "WHERE id=?;";
		
		PreparedStatement prep = con.getConexao().prepareStatement(sql);
		prep.setInt(1, roupa.getId());
		prep.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.desconectar();
		}
	}
	
	
	public LojaRoupa consultar(int id) {
		System.out.println("Aqui");
		LojaRoupa a = new LojaRoupa();
		Conexao con = new Conexao();
		try {
			String sql = "SELECT * FROM cadastro"
					+ " WHERE id=?;";
		
		PreparedStatement prep = con.getConexao().prepareStatement(sql);
		prep.setInt(1, id);
		ResultSet res = prep.executeQuery();
			if (res.next()) {
				a.setId(res.getInt("id"));
				System.out.println("ID: " + a.getId()); // Adiciona a impressão após definir o ID
				a.setDescricao(res.getString("descricao"));
				a.setCategoria(res.getString("categoria"));
				a.setQuantidade(res.getInt("quantidade"));				
				a.setPreco(res.getDouble("preco"));
				a.setTamanho(res.getString("tamanho"));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.desconectar();
		}
		return a;
		
	}
	
	
	
	public List<LojaRoupa> Listar() {
		List<LojaRoupa> lista = new LinkedList<LojaRoupa>();
		Conexao con = new Conexao();

		try {
			String sql = "SELECT * FROM cadastro ORDER BY id";
		
		PreparedStatement prep = con.getConexao().prepareStatement(sql);
		ResultSet res = prep.executeQuery();
			
			while (res.next()) {
				LojaRoupa a = new LojaRoupa();
				a.setId(res.getInt("id"));
				a.setDescricao(res.getString("descricao"));
				//System.out.println("Descrição: " + a.getDescricao()); // Adiciona a impressão após definir a descrição
				a.setCategoria(res.getString("categoria"));
				//System.out.println("Categoria: " + a.getCategoria()); // Adiciona a impressão após definir a categoria
				a.setQuantidade(res.getInt("quantidade"));
				//System.out.println("Quantidade: " + a.getQuantidade()); // Adiciona a impressão após definir a quantidade
				a.setPreco(res.getDouble("preco"));
				//System.out.println("Preço: " + a.getPreco()); // Adiciona a impressão após definir o preço
				a.setTamanho(res.getString("tamanho"));
				//System.out.println("Tamanho: " + a.getTamanho()); // Adiciona a impressão após definir o tamanho
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
	


