package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresDigitos).negate().test(122));
		/**
		 * -> O ".and()" é para fazer uma operação lógica usando o "e",
		 * já que o resultado são dois booleanos pode fazer.
		 * -> O ".negate()" é para negar uma operação, então onde era pra ter 
		 * retornado como true ficará false
		 * -> O ".or()" é para mostrar se um ou o outro é true
		 */
		System.out.println(isPar.or(isTresDigitos).test(123));
	}
}
