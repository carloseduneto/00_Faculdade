package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.entiry.Pessoa;

public class PessoaDAO {

    public void inserir(Pessoa pessoa) {
    	/// CRUD
    	/// C-create | R-retrieve | U-update | D-delete
    	ConectaBD conexao = new ConectaBD();
    	String sql = "INSERT INTO pessoa (nome, email) VALUES (?,?)";
    	try {
    		PreparedStatement prepararFrase = conexao.getConexao().prepareStatement(sql);
    		prepararFrase.setString(1, pessoa.getNome());
    		prepararFrase.setString(2, pessoa.getEmail());
    		prepararFrase.execute();
    		System.out.println(pessoa.getNome() + " inserido");
    	}catch (SQLException e) {
    		System.out.println(e.getMessage());
    	}
    }

    public Pessoa consultar(int id) {
		ConectaBD con = new ConectaBD();
		String sql = "SELECT * FROM pessoa WHERE idPessoa = ?";
		Pessoa p = null;
		try {
		PreparedStatement pst = con.getConexao().prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			String nome = rs.getString("nome");
			String email = rs.getString("email");
			p = new Pessoa(nome, email);
			p.setId(rs.getInt("idPessoa"));
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		return p;
		
		
}
    
    public Pessoa excluir(int id) {
    	PessoaDAO pessoaDAO = new PessoaDAO();
    	ConectaBD conexao = new ConectaBD();
    	String sql = "DELETE FROM pessoa WHERE idPessoa= ?;";
    	Pessoa p = pessoaDAO.consultar(id);
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
    
    public Pessoa atualizar(int id, String nome, String email) {
    	PessoaDAO pessoaDAO = new PessoaDAO();
    	ConectaBD conexao = new ConectaBD();
    	String sql = "UPDATE pessoa SET nome = ?, email = ? WHERE idPessoa= ?;";
    	Pessoa p = pessoaDAO.consultar(id);
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
    
    public List<Pessoa> consultarTudo(){
    	ConectaBD conexao = new ConectaBD();
    	String sql = "SELECT * FROM pessoa";
    	List<Pessoa> lista = new LinkedList<Pessoa>();
    	try {
			PreparedStatement frase = conexao.getConexao().prepareStatement(sql);
			ResultSet resultado = frase.executeQuery();
			
			Pessoa pessoa;
			while(resultado.next()) {
				pessoa = new Pessoa();
				int id = resultado.getInt("IdPessoa");
				String nome = resultado.getString("nome");
				String email = resultado.getString("email");
				pessoa.setId(id);
				pessoa.setNome(nome);
				pessoa.setEmail(email);
				lista.add(pessoa);
				
			}
			
    	} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    	
    	return lista;
    }
}
