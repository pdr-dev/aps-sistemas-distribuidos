package br.com.aps.jokenpo.model;

public class Partida {

	/**
	 * Atributo que faz a primeiro leitura referente a quantidade de rodadas.
	 */
	private int quantidade;

	/**
	 * Objeto do placar do tipo Placar
	 */
	private Placar placar;

	/**
	 * Atributo responsável por armazenar a quantidade de rodadas até o momento.
	 */
	private int rodada;

	/**
	 * Construtor vazio que inicia a quantidade de rodadas e placar com zero.
	 */
	public Partida() {
		super();
		this.quantidade = 0;
		this.placar = new Placar();
		this.rodada = 0;
	}

	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return the placar
	 */
	public Placar getPlacar() {
		return placar;
	}

	/**
	 * @param placar the placar to set
	 */
	public void setPlacar(Placar placar) {
		this.placar = placar;
	}

	/**
	 * @return the rodada
	 */
	public int getRodada() {
		return rodada;
	}

	/**
	 * @param rodada the rodada to set
	 */
	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

}
