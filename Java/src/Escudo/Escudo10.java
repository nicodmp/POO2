package Escudo;

import Personagens.Personagem;

public class Escudo10 extends Escudo{
	public void processaEscudo(int dano, Personagem personagem) {
		int restlife = dano%10;
	
	
	if(restlife !=0 && getSucessor()== null) {
		personagem.levarDano(restlife);
	}
	}
}
