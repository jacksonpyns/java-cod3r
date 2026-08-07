package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;
	
	void acelerar() {
		velocidadeAtual += 5;
	}
	
	void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	// Método que retorna uma String pronta
	public String toString() { // Esse método precisa ser obrigátoriamente público
		return "Velocidade atual é " + velocidadeAtual + "Km/h.";
	}
}
