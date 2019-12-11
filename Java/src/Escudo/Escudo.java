package Escudo;

import Personagens.Personagem;

public abstract class Escudo {

	private Escudo sucessor;
	private Personagem personagem;
	
	public void setSucessor(Escudo sucessor) {
		this.sucessor = sucessor;
	}
	
	public Escudo getSucessor() {
		return this.sucessor;
	}
	
	public abstract void processaEscudo(int dano, Personagem personagem);
}
