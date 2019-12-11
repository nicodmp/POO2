package PoderesAtaque;

import TiposAtaque.Ataque;

public class PoderForte extends PoderDecorador{

	public PoderForte(Ataque danoDecorado) {
		super(danoDecorado);
		setDano(10);
	}

	
	
}
