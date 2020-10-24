package br.com.aps.jokenpo.service.impl;

import br.com.aps.jokenpo.enums.OpcaoEnum;
import br.com.aps.jokenpo.model.Partida;
import br.com.aps.jokenpo.model.Placar;
import br.com.aps.jokenpo.service.Jokenpo;

public class JokenpoImpl implements Jokenpo {

	private static final JokenpoImpl INSTANCE = new JokenpoImpl();

	public static JokenpoImpl getInstance() {
		return INSTANCE;
	}

	@Override
	public Partida verificaJogada(Partida partida, OpcaoEnum jogadaPrimeiroJogador, OpcaoEnum jogadaSegundoJogador) {
		AcaoImpl acao = AcaoImpl.getInstance();
		Partida resultado = getGanhador(partida, jogadaPrimeiroJogador, jogadaSegundoJogador);
		acao.getPartida(resultado);
		return resultado;
	}

	private Partida getGanhador(Partida partida, OpcaoEnum jogadaPrimeiroJogador, OpcaoEnum jogadaSegundoJogador) {
		switch (jogadaPrimeiroJogador) {
		case PEDRA:
			switch (jogadaSegundoJogador) {
			case PEDRA:
				erroEmpate(partida);
				break;
			case PAPEL:
				partida = getVitoriaSegundoJogador(partida);
				break;
			case TESOURA:
				partida = getVitoriaPrimeiroJogador(partida);
				break;
			default:
				erroSegundoJogador();
			}
			break;
		case PAPEL:
			switch (jogadaSegundoJogador) {
			case PAPEL:
				erroEmpate(partida);
				break;
			case TESOURA:
				partida = getVitoriaSegundoJogador(partida);
				break;
			default:
				erroSegundoJogador();
			}
			break;
		case TESOURA:
			switch (jogadaSegundoJogador) {
			case TESOURA:
				erroEmpate(partida);
				break;
			default:
				erroSegundoJogador();
			}
			break;
		default:
			erroPrimeiroJogador();
			break;
		}
		return partida;
	}

	private void erroPrimeiroJogador() {
		System.out.println(
				"Jogada digitada pelo primeiro jogador é inválida." + "\nA rodada não valeu e será retornada!");
	}

	private void erroSegundoJogador() {
		System.out
				.println("Jogada digitada pelo segundo jogador é inválida." + "\nA rodada não valeu e será retornada!");
	}

	private void erroEmpate(Partida partida) {
		System.out.println(
				"\nHouve um empate na rodada " + partida.getRodada() + "." + "\nA rodada não valeu e será retornada!");
	}

	private Partida getVitoriaPrimeiroJogador(Partida partida) {
		System.out.println("\nO primeiro jogador ganhou a rodada " + partida.getRodada() + ".");
		Placar placar = partida.getPlacar();
		placar.setPrimeiroJogador(placar.getPrimeiroJogador() + 1);
		partida.setRodada(partida.getRodada() + 1);
		partida.setPlacar(placar);
		return partida;
	}

	private Partida getVitoriaSegundoJogador(Partida partida) {
		System.out.println("\nO segundo jogador ganhou a rodada " + partida.getRodada() + ".");
		Placar placar = partida.getPlacar();
		placar.setPrimeiroJogador(placar.getSegundoJogador() + 1);
		partida.setRodada(partida.getRodada() + 1);
		partida.setPlacar(placar);
		return partida;
	}
}
