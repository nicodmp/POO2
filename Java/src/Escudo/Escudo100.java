package Escudo;

import Personagens.Personagem;

public class Escudo100 extends Escudo {

	public void processaEscudo(int dano, Personagem personagem) {
		int restlife = dano%100;
		
	
	if(restlife !=0 && getSucessor()!= null) {
		getSucessor().processaEscudo(restlife, personagem);
	}
	}
}
