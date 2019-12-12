package Command;
import Personagens.*;

public class Atacar implements Command {
	Personagem p;
	
	public Atacar(Personagem personagem) {
		this.p= personagem;
	}
	
	public void execute() {
		this.p.atacar();
	}
}
