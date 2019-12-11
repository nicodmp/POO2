package Personagens;

import TiposAtaque.Forte;
import TiposCorrida.MovMedio;
import TiposPulo.Medio;


public class Personagem01 extends Personagem {

	public Personagem01() {
		setAtaque(new Forte());
		setMovimento(new MovMedio());
		setPulo(new Medio());
	}
}
