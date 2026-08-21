package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		// Pode-se escrever em uma linha só pq tem pouca coisa
		Calculo calc = (x, y) -> { return x + y; };
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y;
		/**
		 *  Já que na segunda parte está sem os parenteses, haverá 
		 * de forma implicita um "return" que nem na situação de cima;
		 */
		System.out.println(calc.executar(2,  3));
		
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal()); 
		// É um método estatico, por isso chamar pela classe
	}
}
