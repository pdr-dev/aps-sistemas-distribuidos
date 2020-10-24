package br.com.aps.jokenpo.enums;

public enum OpcaoEnum {

	PEDRA(1), PAPEL(2), TESOURA(3);

	private int codigo;

	OpcaoEnum(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return this.codigo;
	}
}
