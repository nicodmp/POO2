package Personagens;

import TiposAtaque.Forte;
import TiposCorrida.Rapido;
import TiposPulo.Baixo;

public class Personagem03 extends Personagem {

	public Personagem03(){
		setAtaque(new Forte());
		setMovimento(new Rapido());
		setPulo(new Baixo());
	}
}
