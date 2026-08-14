package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA; // Valor constante
	protected int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA; 
		} else {
			velocidadeAtual += getDelta();
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= delta) {
			velocidadeAtual -= this.delta;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	// Método que retorna uma String pronta
	public String toString() { // Esse método precisa ser obrigátoriamente público
		return "Velocidade atual é " + velocidadeAtual + "Km/h.";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
