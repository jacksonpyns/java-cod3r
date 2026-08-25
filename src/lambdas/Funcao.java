package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		/**
		 *  Function recebe como parâmetro de entrada um número inteiro (o Wrapper Integer)
		 * e essa interface vai retornar um valor String: 
		 *  Ele recebe um numero, verifica se o "resto" desse numero é igual a zero,
		 * se for significa que ele é "Par", se não ele é "Ímpar"
		 */
		
		/**
		 *  A saída de uma função é entrada de outra função. Os parâmetros de retorno e de entrada 
		 * das funções devem ser compatíveis para que isso ocorra de forma correta.
		 */
		Function<String, String> oResultadoE = valor -> "O reusltado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";
		
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		/**
		 *  O ".andThen" serve como "e então", porém ele funciona depois do ".apply(32)",
		 * ele primeiro chamao "parOuImpar.apply(32)" e depois o ".andThen(oResultadoE)"
		 */
		
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(33);
		System.out.println(resultadoFinal2);

		
		System.out.println(parOuImpar.apply(32));
	}
}
