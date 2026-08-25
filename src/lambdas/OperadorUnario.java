package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;

		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		/** 
		 *  O ".compose()" começa pelo ultimo.
		 *  É como se fosse:
		 * -> Antes de executar o "aoQuadrado" execute o "vezesDois"
		 * -> Antes de executar o "vezesDois" execute o "maisDois"
		 * 
		 *  Lembrando que o ".apply()" é o método que starta o processo!
		 */
		System.out.println(resultado2);
	}
}
