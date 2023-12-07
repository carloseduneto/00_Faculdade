package Prova;

import java.util.ArrayList;

public class Jogadores {
	private String nome;
	private String posicao;
	private int numeroCamisa;
	private ArrayList<Time> times;
	
	public Jogadores(String nome, String posicao, int numeroCamisa) {
		this.nome = nome;
		this.posicao = posicao;
		this.numeroCamisa = numeroCamisa;
		this.times =  new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public ArrayList<Time> getTimes() {
		return times;
	}
	
	public void exibeTime() {
		System.out.println(times);
	}
	
	public void adicionarTime(Time nomeTime) {
		times.add(nomeTime);
	}

}
