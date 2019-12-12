package Personagens;

import TiposAtaque.Medio;
import TiposCorrida.Rapido;
import TiposPulo.Baixo;

public class Personagem02 extends Personagem {

	public Personagem02() {
		setAtaque(new Medio());
		setMovimento(new Rapido());
		setPulo(new Baixo());
	}
}
