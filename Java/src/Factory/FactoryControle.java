package Factory;
import Command.*;
import Personagens.*;

public class FactoryControle {
	public Controle getinvoker(Personagem p) {
		Controle c = new Controle();
		
		c.setCommand(new MoverEsq(p),0);
        c.setCommand(new MoverDir(p),1);
        c.setCommand(new MoverCima(p),2);
        c.setCommand(new MoverBaixo(p),3);
        c.setCommand(new Atacar(p),4);
        c.setCommand(new Correr(p),5);
        c.setCommand(new Pular(p),6);
        c.setCommand(new Castar(p),7);
        c.setCommand(new MacroL(p),8);
        c.setCommand(new MacroR(p),9);
		
		return c;
	}

}
