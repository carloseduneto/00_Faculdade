package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.entiry.Titular;
import model.entiry.Titular2;

public class TitularDAO {

    public void inserir(model.entiry.Titular novoTitular) {
    	/// CRUD
    	/// C-create | R-retrieve | U-update | D-delete
    	ConectaBD conexao = new ConectaBD();
    	String sql = "INSERT INTO titular (nome, cpf) VALUES (?,?)";
    	try {
    		PreparedStatement prepararFrase = conexao.getConexao().prepareStatement(sql);
    		prepararFrase.setString(1, novoTitular.getNomeTitular());
    		prepararFrase.setString(2, novoTitular.getDocumentoTitular());
    		prepararFrase.execute();
    		System.out.println(novoTitular.getNomeTitular() + " inserido");
    	}catch (SQLException e) {
    		System.out.println(e.getMessage());
    	}
    }

    public Titular consultar(int id) {
		ConectaBD con = new ConectaBD();
		String sql = "SELECT * FROM pessoa WHERE idPessoa = ?";
		Titular p = null;
		try {
		PreparedStatement pst = con.getConexao().prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			String nome = rs.getString("nome");
			String email = rs.getString("email");
			p = new Titular(nome, email);
			p.setId(rs.getInt("idPessoa"));
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		return p;
		
		
}
    
    public String consultarNome(int id) {
		ConectaBD con = new ConectaBD();
		String sql = "SELECT * FROM titular WHERE idTitular = ?";
		String p = null;
		try {
		PreparedStatement pst = con.getConexao().prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			String nome = rs.getString("nome");
			p = nome;
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		return p;
		
		
}
    
    public Titular2 excluir(int id) {
    	TitularDAO pessoaDAO = new TitularDAO();
    	ConectaBD conexao = new ConectaBD();
    	String sql = "DELETE FROM pessoa WHERE idPessoa= ?;";
    	Titular2 p = pessoaDAO.consultar(id);
    	if (p.getId()!= 0) {
    		
    		try{
    			PreparedStatement frase = conexao.getConexao().prepareStatement(sql);
    			frase.setInt(1, id);
    			frase.execute();
    			System.out.println("Registro deletado com sucesso!!!");
    		}catch (SQLException e) {
    			System.out.println(e.getMessage());
    		}
    	}return p;
    }
    
    public Titular2 atualizar(int id, String nome, String email) {
    	TitularDAO pessoaDAO = new TitularDAO();
    	ConectaBD conexao = new ConectaBD();
    	String sql = "UPDATE pessoa SET nome = ?, email = ? WHERE idPessoa= ?;";
    	Titular2 p = pessoaDAO.consultar(id);
    	if (p.getId()!= 0) {
    		
    		try{
    			PreparedStatement frase = conexao.getConexao().prepareStatement(sql);
    			frase.setString(1, nome);
    			frase.setString(2, email);
    			frase.setInt(3, id);
    			frase.execute();
    			System.out.println("Registro atualizado com sucesso!!!");
    		}catch (SQLException e) {
    			System.out.println(e.getMessage());
    		}
    	}return p;
    }
    
    public List<Titular> consultarTudo(){
    	ConectaBD conexao = new ConectaBD();
    	String sql = "SELECT * FROM titular";
    	List<Titular> lista = new LinkedList<Titular>();
    	try {
			PreparedStatement frase = conexao.getConexao().prepareStatement(sql);
			ResultSet resultado = frase.executeQuery();
			
			Titular pessoa;
			while(resultado.next()) {
				pessoa = new Titular();
				int id = resultado.getInt("IdTitular");
				String nome = resultado.getString("nome");
				String cpf = resultado.getString("cpf");
				pessoa.setId(id);
				pessoa.setNomeTitular(nome);
				pessoa.setDocumentoTitular(cpf);;
				lista.add(pessoa);
				
			}
			
    	} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    	
    	return lista;
    }

	

	
}
