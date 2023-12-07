package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.entiry.Pessoa;
import model.entiry.Veiculo;


public class ProdutoDAO {

	public ProdutoDAO() {
		
	}
	
	  public void inserir(Veiculo veiculo) {
	    	ConectaBD conexao = new ConectaBD();
	    	String sql = "INSERT INTO veiculo (numeroChassi, placa, modelo, marca, valor) VALUES (?,?,?,?,?)";
	    	try {
	    		PreparedStatement pst = conexao.getConexao().prepareStatement(sql);
	    		pst.setString(1, veiculo.getNumeroChassi());
	    		pst.setString(2, veiculo.getPlaca());
	    		pst.setString(3, veiculo.getModelo());
	    		pst.setString(4, veiculo.getMarca());
	    		pst.setDouble(5, veiculo.getValor());
	    		pst.execute();
	    		System.out.println(veiculo.getMarca()+" Inserido");
	    	}catch (SQLException e) {
	    		System.out.println(e.getMessage());
	    	}
	    }
	  
	
	  public Veiculo consultar(int id) {
		  ConectaBD con = new ConectaBD();
			String sql = "SELECT * FROM veiculo WHERE idVeiculo = ?";
			Veiculo v = null;
			try {
			PreparedStatement pst = con.getConexao().prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				String numeroChassi = rs.getString("numeroChassi");
				String placa = rs.getString("placa");
				String modelo = rs.getString("modelo");
				String marca = rs.getString("marca");
				double valor = rs.getDouble("valor");
				v = new Veiculo(numeroChassi, placa, modelo, marca, valor);
				v.setId(rs.getInt("idVeiculo"));
			}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
			return v;	  
	  }
	  
	  
	  public Veiculo excluir(int id) {
	    	ProdutoDAO produtoDAO = new ProdutoDAO();
	    	ConectaBD conexao = new ConectaBD();
	    	String sql = "DELETE FROM veiculo WHERE idVeiculo= ?;";
	    	Veiculo p = produtoDAO.consultar(id);
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
	  
	    public List<Veiculo> consultarTudo(){
	    	ConectaBD conexao = new ConectaBD();
	    	String sql = "SELECT * FROM veiculo";
	    	List<Veiculo> lista = new LinkedList<Veiculo>();
	    	try {
				PreparedStatement frase = conexao.getConexao().prepareStatement(sql);
				ResultSet resultado = frase.executeQuery();
				
				Veiculo veiculo;
				while(resultado.next()) {
					veiculo = new Veiculo();
					int id = resultado.getInt("IdVeiculo");
					String numeroChassi = resultado.getString("numeroChassi");
					String placa = resultado.getString("placa");
					String modelo = resultado.getString("modelo");
					String marca = resultado.getString("marca");
					double valor = resultado.getDouble("valor");
					veiculo.setId(id);
					veiculo.setNumeroChassi(numeroChassi);
					veiculo.setPlaca(placa);
					veiculo.setModelo(modelo);
					veiculo.setMarca(marca);
					veiculo.setValor(valor);
					lista.add(veiculo);
					
				}
				
	    	} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
	    	
	    	return lista;
	    }
	  
	    
	    public Veiculo atualizarCarro(int id, String numeroChassi, String placa, String modelo, String marca, double valor) {
	    	ProdutoDAO produtoDAO = new ProdutoDAO();
	    	ConectaBD conexao = new ConectaBD();
	    	String sql = "UPDATE veiculo SET numeroChassi = ?, placa = ?, modelo = ?, marca = ?, valor = ? WHERE idVeiculo= ?;";
	    	Veiculo v = produtoDAO.consultar(id);
	    	if (v.getId()!= 0) {
	    		
	    		try{
	    			PreparedStatement frase = conexao.getConexao().prepareStatement(sql);
	    			frase.setString(1, numeroChassi);
					frase.setString(2, placa);
					frase.setString(3, modelo);
					frase.setString(4, marca);
					frase.setDouble(5, valor);
	    			frase.setInt(6, id);
	    			frase.execute();
	    			System.out.println("Registro atualizado com sucesso!!!");
	    		}catch (SQLException e) {
	    			System.out.println(e.getMessage());
	    		}
	    	}return v;
	    }
	    
	    public Veiculo consultarPlaca(String placa){
			ConectaBD con = new ConectaBD();
			String sql = "SELECT * FROM veiculo WHERE placa = ?";
	    	Veiculo v = null; 
	    	try {
				PreparedStatement pst = con.getConexao().prepareStatement(sql);
				pst.setString(1, placa);
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
				
					String Chassi = rs.getString("numeroChassi");
					String Placa =  rs.getString("placa");
					String Modelo = rs.getString("modelo");
					String marca = rs.getString("marca");
					double Valor = rs.getDouble("valor");
					v = new Veiculo(Chassi, Placa, Modelo, marca, Valor);
					v.setId(rs.getInt("idVeiculo"));
				}
				
	    	} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
	    	
	    	return v;
	    }
	  
		

	}
