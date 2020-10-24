package br.com.aps.jokenpo.enums;

public enum JogadorEnum {

	MULTIPLAYER(1, "MULTIPLAYER"), CPU(2, "CPU");

	private int codigo;
	private String nome;

	JogadorEnum(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getNome() {
		return this.nome;
	}
}
