package lambdas;

// Interface Funcional é aquela que só tem um único método
@FunctionalInterface // Interface Funcional, só aceita um único método na Interface
public interface Calculo {

	public abstract double executar(double a, double b); 
	/**
	 *  Não é obrigatório deixar o "public" e o "abstract" já que são
	 *  introduzidos de forma implicita
	 */
	
	// O Java sabe que nesta Interface só tem um único método abstract
	default String legal() {
		return "legal!";
		/**
		 *  Então essse default não causará poblemas, será um método que 
		 * tem a implementação padrão
		 */
	}
	
	// Pode-se ter também um outro método estatico
	static String muitoLegal() {
		return "Muito Legal!";
	}
}
