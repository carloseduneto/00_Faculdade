package model.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import model.entiry.CartaoDeCredito;
import model.entiry.Titular;
import model.entiry.Titular2;

public class CartaoDAO {

	public void inserir(CartaoDeCredito novoCartaoDeCredito, int idTitular, String nome) {
	    ConectaBD conexao = new ConectaBD();
	    String sql = "INSERT INTO cartao (numero, validade, nome, idTitular) VALUES (?,?,?,?)";
	    try (PreparedStatement prepararFrase = conexao.getConexao().prepareStatement(sql)) {
	        prepararFrase.setString(1, novoCartaoDeCredito.getNumeroCartao());
	        prepararFrase.setDate(2, Date.valueOf(novoCartaoDeCredito.getDataValidade()));
	        prepararFrase.setString(3, nome);
	        prepararFrase.setInt(4, idTitular);
	        prepararFrase.execute();
	        System.out.println("Cartão inserido com sucesso");
	    } catch (SQLException e) {
	        System.out.println("Erro ao inserir o cartão: " + e.getMessage());
	    } finally {
	        conexao.fecharConexao();
	    }
	}


    public Titular2 consultar(int id) {
		ConectaBD con = new ConectaBD();
		String sql = "SELECT * FROM pessoa WHERE idPessoa = ?";
		Titular2 p = null;
		try {
		PreparedStatement pst = con.getConexao().prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			String nome = rs.getString("nome");
			String email = rs.getString("email");
			p = new Titular2(nome, email);
			p.setId(rs.getInt("idPessoa"));
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		return p;
		
		
}
    
    public Titular2 excluir(int id) {
    	CartaoDAO pessoaDAO = new CartaoDAO();
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
    	CartaoDAO pessoaDAO = new CartaoDAO();
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
    
    public List<CartaoDeCredito> consultarCartoesTitulares(int idTitular){
    	ConectaBD conexao = new ConectaBD();
    	String sql = "SELECT idCartao , nome FROM cartao WHERE idTitular = ?;";
    	
    	TitularDAO titularDAO01 = new TitularDAO();
		String titular = titularDAO01.consultarNome(idTitular);
    	
    	List<CartaoDeCredito> lista = new LinkedList<CartaoDeCredito>();
    	try {
			PreparedStatement frase = conexao.getConexao().prepareStatement(sql);
			frase.setInt(1, idTitular);
			ResultSet resultado = frase.executeQuery();
			CartaoDeCredito cartao;
			while(resultado.next()) {
				cartao = new CartaoDeCredito();
				int id = resultado.getInt("IdTitular");
				String nome = resultado.getString("nome");
				
				cartao.setId(id);
				cartao.setNomeAdicional(nome);
				lista.add(cartao);
				
			}
			
    	} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    	
    	return lista;
    }

	

	
}
