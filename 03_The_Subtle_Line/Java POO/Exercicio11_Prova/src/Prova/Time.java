package Prova;

import java.util.ArrayList;

public class Time {
	private String nome;
	private String estado;
	private String cores;
	private ArrayList<Jogadores> jogador;
	
	public Time(String nome, String estado, String cores) {
		this.nome = nome;
		this.estado = estado;
		this.cores = cores;
		this.jogador = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public String getEstado() {
		return estado;
	}

	public String getCores() {
		return cores;
	}

	public ArrayList<Jogadores> getJogador() {
		return jogador;
	}
	
	public void adcionarJogaodor(Jogadores nomeJogador) {
		jogador.add(nomeJogador);
	}

}
