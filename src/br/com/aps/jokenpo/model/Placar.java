package br.com.aps.jokenpo.model;

public class Placar {

	/**
	 * Atributo responsável por armazenar as vitórias do primeiro jogador.
	 */
	private int primeiroJogador;

	/**
	 * Atributo responsável por armazenar as vitórias do segundo jogador.
	 */
	private int segundoJogador;

	/**
	 * Construtor vazio que inicia os atributos com o default 0.
	 */
	public Placar() {
		super();
		this.primeiroJogador = 0;
		this.segundoJogador = 0;
	}

	/**
	 * @param primeiroJogador
	 * @param segundoJogador
	 */
	public Placar(int primeiroJogador, int segundoJogador) {
		super();
		this.primeiroJogador = primeiroJogador;
		this.segundoJogador = segundoJogador;
	}

	/**
	 * @return the primeiroJogador
	 */
	public int getPrimeiroJogador() {
		return primeiroJogador;
	}

	/**
	 * @param primeiroJogador the primeiroJogador to set
	 */
	public void setPrimeiroJogador(int primeiroJogador) {
		this.primeiroJogador = primeiroJogador;
	}

	/**
	 * @return the segundoJogador
	 */
	public int getSegundoJogador() {
		return segundoJogador;
	}

	/**
	 * @param segundoJogador the segundoJogador to set
	 */
	public void setSegundoJogador(int segundoJogador) {
		this.segundoJogador = segundoJogador;
	}

}
