package br.com.aps.jokenpo.service;

import br.com.aps.jokenpo.model.Partida;

public interface Acao {

	public void getOptions();

	public void getMenu();

	public void getPartida(Partida partida);

}
