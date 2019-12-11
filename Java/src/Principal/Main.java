/*
 * Alunos:
 * César Ricardo Salomão Junior - 11811BSI226
 * Nicolas de Melo Proença - 11811BSI234
 * Caio Marcio Santos - 11811BSI223
 */

package Principal;

import Escudo.Escudo;
import Escudo.Escudo10;
import Escudo.Escudo100;
import Escudo.Escudo25;
import Escudo.Escudo50;
import Observer.Inimigos;
import Personagens.Personagem;
import Personagens.Personagem01;
import PoderesAtaque.PoderForte;
import PoderesAtaque.PoderFraco;
import PoderesAtaque.PoderMedio;
import TiposAtaque.Ataque;
import TiposAtaque.AtkMedio;
import TiposAtaque.Forte;
import TiposAtaque.Fraco;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		
		/* TESTE PADRAO DECORATOR 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
				
				Personagem p1 = new Personagem01();
				Ataque a1 = new Forte();
				p1.setAtaque(a1);
				System.out.println("Poder recebido.");
				System.out.println("Ataque do personagem: " + p1.getAtaque().getDano());	
				a1 = new PoderForte(a1);
				p1.setAtaque(a1);
				System.out.println("Poder recebido.");
				System.out.println("Ataque do personagem: " + p1.getAtaque().getDano());	
				a1 = new PoderMedio(a1);
				p1.setAtaque(a1);
				System.out.println("Poder recebido.");
				System.out.println("Ataque do personagem: " + p1.getAtaque().getDano());
				
				
				
/* 
 * 
 * 
 * 
 * TESTE das 4 primeiras iterações
 * 
 *  
 *  */		
		
		
//		Personagem viking = new Personagem();
//		Inimigos i1 = new Inimigos(5, 10, 33);
//		Inimigos i2 = new Inimigos(13, 15, 759);
//		Inimigos i3 = new Inimigos(24, 10, 37);
//		Inimigos i4 = new Inimigos(15, 55, 555);
//		Inimigos i5 = new Inimigos(57, 20, 111);
//		Inimigos i6 = new Inimigos(18, 35, 246);
//		
//		viking.addObserver(i1);
//		viking.addObserver(i2);
//		viking.addObserver(i3);
//		viking.addObserver(i4);
//		viking.addObserver(i5);
//		viking.addObserver(i6);
//
//		
//        while(true){
//            viking.show();
//            Thread.sleep(200);
//        }
        

		

		
		
/*
 * 
 *  
 *  
 *  
 *  
 *  
 *  OUTROS TESTES
 *  
 *   
 *   
 *   
 *   
 *   */	
//		viking.levarDano(0); //levando 0 de dano só para mostrar a vida inicial do viking.
//		System.out.print("\n");
//		
//		Escudo escudo100 = new Escudo100();
//		Escudo escudo50 = new Escudo50();
//		Escudo escudo25 = new Escudo25();
//		Escudo escudo10 = new Escudo10();
//		Escudo escudo5 = new Escudo5();
//		
//		//Supondo que o personagem tem todos os escudos. Ele pode ter apenas alguns, de forma que comece, por exemplo, em escudo 25.
//		escudo100.setSucessor(escudo50);
//		escudo50.setSucessor(escudo25);
//		escudo25.setSucessor(escudo10);
//		escudo10.setSucessor(escudo5);
//		escudo5.setSucessor(null);
//		
//		escudo100.processaEscudo(523, viking); //Determinando qual personagem vai levar o dano.
		
		
	}

}
