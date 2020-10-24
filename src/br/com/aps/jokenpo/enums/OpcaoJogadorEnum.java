package br.com.aps.jokenpo.enums;

public enum OpcaoJogadorEnum {

	ERRO_SEGUNDO_JOGADOR(-2), ERRO_PRIMEIRO_JOGADOR(-1), EMPATE(0), PRIMEIRO_JOGADOR(1), SEGUNDO_JOGADOR(2);

	private int id;

	private OpcaoJogadorEnum(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

}
