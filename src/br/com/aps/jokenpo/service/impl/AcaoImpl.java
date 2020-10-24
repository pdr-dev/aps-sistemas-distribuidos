package br.com.aps.jokenpo.service.impl;

import br.com.aps.jokenpo.model.Partida;
import br.com.aps.jokenpo.service.Acao;

public class AcaoImpl implements Acao {

	private static final AcaoImpl INSTANCE = new AcaoImpl();

	public static AcaoImpl getInstance() {
		return INSTANCE;
	}

	@Override
	public void getOptions() {
		System.out.println("\n" + "================================== \n" + "Jooooo... \n" + "Keeeeen... \n"
				+ "PÔÔÔÔÔÔ!!! \n" + "================================== \n" + "Escolha entre 1, 2 e 3, sendo: \n"
				+ "PEDRA = 1 \n" + "PAPEL = 2 \n" + "TESOURA = 3 \n");
	}

	@Override
	public void getMenu() {
		System.out.println("\n" + "Escolha entre 1 para obter uma partida MULTIPLAYER e 2 para jogar contra a CPU: ");
	}

	@Override
	public void getPartida(Partida partida) {
		System.out.println("\n" + "============= PLACAR ============= \n" + "Primeiro jogador "
				+ partida.getPlacar().getPrimeiroJogador() + " x Segundo jogador "
				+ partida.getPlacar().getSegundoJogador() + "\n" + partida.getRodada() + " rodadas de "
				+ partida.getQuantidade() + " restantes.");
	}
}
