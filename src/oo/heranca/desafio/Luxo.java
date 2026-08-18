package oo.heranca.desafio;

public interface Luxo {

	public void ligarAr(); // Está "public" de forma implicita
	abstract void desligarAr(); // Está "abstract" de forma implicita
	
	default int velocidadeDoAr() {
		return 1;
		/**
		 *  O padrão é que a velocidade do Ar retorne 1 para todos os que
		 * receberem esse método herdado.
		 */
	} 
}
