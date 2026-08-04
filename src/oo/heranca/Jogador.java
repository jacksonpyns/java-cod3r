package oo.heranca;

public class Jogador {

	int x;
	int y;
	
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
