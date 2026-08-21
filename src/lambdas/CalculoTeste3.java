package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		/**
		 *  Quando se define um número literal inteiro, ou seja, qualquer número que
		 * não tem casas decimais ou pontos flutuantes (como virgula ou ponto), ele é
		 * do tipo int, e no Java não tem como converter um valor de um tipo primitivo
		 * para um valor Double do tipo classe.
		 * 
		 * NÃO: int -> Double
		 * double -> Double
		 * 
		 */
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(2.0, 3.0));
			
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
			
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		System.out.println(calc2.apply(2, 3));
			
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
	}
}