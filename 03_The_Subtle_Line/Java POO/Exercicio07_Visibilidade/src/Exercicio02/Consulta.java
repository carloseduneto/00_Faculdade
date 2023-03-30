package Exercicio02;

public class Consulta {
	private String NomePaciente;
	private String telefone;
	private String dataConsulta;
	private String dataRetorno;
	private String medico;
	private String sintomas;
	
	public Consulta(String NomePaciente, String telefone) {
		this.NomePaciente= NomePaciente;
		this.telefone = telefone;
	}
	
	public void novaDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	public void novaDataRetorno(String novoRetorno) {
		dataRetorno = novoRetorno;
	}
	
	public void novoMedico (String medico) {
		this.medico = medico;
	}
	
	public void registrarSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
	public String retornaDataConsulta() {
		return dataConsulta;
	}
	
	public String retornaDataRetorno() {
		return dataRetorno;
	}
	
	public String retornaMedico() {
		return medico;
	}
	
	public String retornaSintomas() {
		return sintomas;
	}
	
	public String retornaNome() {
		return NomePaciente;
	}
	
	public String retornaTelefone() {
		return telefone;
	}

	

}
