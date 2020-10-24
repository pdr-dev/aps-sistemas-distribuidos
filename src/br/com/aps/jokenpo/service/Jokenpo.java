package br.com.aps.jokenpo.service;

import br.com.aps.jokenpo.enums.OpcaoEnum;
import br.com.aps.jokenpo.model.Partida;

public interface Jokenpo {

	public Partida verificaJogada(Partida partida, OpcaoEnum jogadaPrimeiroJogador, OpcaoEnum jogadaSegundoJogador);

}
