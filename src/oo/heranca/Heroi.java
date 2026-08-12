package oo.heranca;

public class Heroi extends Jogador { // extends == herança

	// O método foi sobscrito
	// Aqui o Heroi tem um bonûs de ataque que tira 20 da vida
//	boolean atacar(Jogador oponente) { 
//		int deltaX = Math.abs(x - oponente.x); 
//		int deltaY = Math.abs(y - oponente.y); 
//		
//		if(deltaX == 0 && deltaY == 1) { 
//			oponente.vida -= 20;
//			return true;
//		} else if(deltaX == 1 && deltaY == 0) {
//			oponente.vida -= 20;
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public Heroi(int x, int y){
		super(x, y);
	}
	
	// Para não ter que reescrever o método todo usa-se o "super." 
	public boolean atacar(Jogador oponente) { 
		boolean ataque1 = super.atacar(oponente); // para pegar da classe super(classe pai).
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3; // para que ele ataque três vezes 10 + 10 + 10
	}
}
