package Principal;
import Labirinto.*;
import Personagens.*;

public class Game implements Runnable {
	private Component labirinto;
    private Personagem p;
    
    public Game(Component labirinto, Personagem p){
        this.labirinto = labirinto;
        this.p = p;
    }
    
    public void run(){
        
        labirinto.jogar(p);
        
    }

}
