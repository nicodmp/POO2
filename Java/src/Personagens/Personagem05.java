package Personagens;

import TiposAtaque.*;
import TiposCorrida.*;
import TiposPulo.*;
import TiposMagia.*;

public class Personagem05 extends Personagem {

	public Personagem05(){
		setAtaque(new Forte());
		setMovimento(new Rapido());
		setPulo(new Baixo());
		setMagia(new Fogo());
	}
}
