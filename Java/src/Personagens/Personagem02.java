package Personagens;

import TiposAtaque.AtkMedio;
import TiposCorrida.Rapido;
import TiposPulo.Baixo;

public class Personagem02 extends Personagem {

	public Personagem02() {
		setAtaque(new AtkMedio());
		setMovimento(new Rapido());
		setPulo(new Baixo());
	}
}
