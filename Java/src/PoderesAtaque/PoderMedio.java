package PoderesAtaque;

import TiposAtaque.Ataque;

public class PoderMedio extends PoderDecorador{

	public PoderMedio(Ataque danoDecorado) {
		super(danoDecorado);
		setDano(5);
	}

}
