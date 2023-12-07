package SistemaDeCartao;

import model.entiry.CartaoDeCredito;

public class CartaoDeCreditoAdicional extends CartaoDeCredito {
	private String nomeAdicional;
	private String numeroCartaoAdional;
	private String dataValidadeAdicional;
	private double limiteCreditoAdicional;
	
	
	public String getNomeAdicional() {
		return nomeAdicional;
	}


	public void setNomeAdicional(String nomeAdicional) {
		this.nomeAdicional = nomeAdicional;
	}


	public String getNumeroCartaoAdional() {
		return numeroCartaoAdional;
	}


	public void setNumeroCartaoAdional(String numeroCartaoAdional) {
		this.numeroCartaoAdional = numeroCartaoAdional;
	}


	public String getDataValidadeAdicional() {
		return dataValidadeAdicional;
	}


	public void setDataValidadeAdicional(String dataValidadeAdicional) {
		this.dataValidadeAdicional = dataValidadeAdicional;
	}


	public double getLimiteCreditoAdicional() {
		return limiteCreditoAdicional;
	}


	public void setLimiteCreditoAdicional(double limiteCreditoAdicional) {
		this.limiteCreditoAdicional = limiteCreditoAdicional;
	}



	public CartaoDeCreditoAdicional(String documentoTitular,String nomeAdicional, String numeroCartaoAdional, String dataValidadeAdicional,
			float limiteCreditoAdicional) {
		super();
		setDocumentoTitular(documentoTitular);
		this.nomeAdicional = nomeAdicional;
		this.numeroCartaoAdional = numeroCartaoAdional;
		this.dataValidadeAdicional = dataValidadeAdicional;
		this.limiteCreditoAdicional = limiteCreditoAdicional;
		setLimiteCredito(limiteCreditoAdicional);
	}

	
	
}
