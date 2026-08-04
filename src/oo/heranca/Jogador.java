package oo.heranca;

public class Jogador {

	int vida = 100;
	int x;
	int y;
	
	boolean atacar(Jogador oponente) { // boolean para saber se o ataque ocorreu ou não
		int deltaX = Math.abs(x - oponente.x); // Para saber o valor absoluto,
		int deltaY = Math.abs(y - oponente.y); // e se der -1 o resultado fica 1
		
		if(deltaX == 0 && deltaY == 1) { // Como se os jogadores estivessem um do lado do outro
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	boolean andar (Direcao direcao) { // Método indicando os lados que o jogador pode andar
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
//		if(direcao == Direcao.NORTE) {
//			y++;
//		}
		
		return true;
	}
}
