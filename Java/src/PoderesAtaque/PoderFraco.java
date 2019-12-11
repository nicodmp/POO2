package PoderesAtaque;

import TiposAtaque.Ataque;

public class PoderFraco extends PoderDecorador{

	public PoderFraco(Ataque danoDecorado) {
		super(danoDecorado);
		setDano(7);
	}

}
