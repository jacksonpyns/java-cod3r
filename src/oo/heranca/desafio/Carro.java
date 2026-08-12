package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA; // Valor constante
	int velocidadeAtual;
	int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA; 
		}else {
			velocidadeAtual += delta;
		}
		
	}
	
	void frear() {
		if(velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	// Método que retorna uma String pronta
	public String toString() { // Esse método precisa ser obrigátoriamente público
		return "Velocidade atual é " + velocidadeAtual + "Km/h.";
	}
}
