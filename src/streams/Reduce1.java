package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		int total1 = nums.stream().reduce(soma).get(); // Para pegar o resultado gerado ".get()"
		System.out.println(total1);
		
		/*
		 *  ".stream()" executa as operações um elemento por vez, em ordem
		 * estrita e usando apenas uma thread do processador.
		 * 
		 *  ".parallelStream()" divide a coleção em partes menores e usa o pool de threads
		 * para rodar em vários núcleos da CPU ao mesmo tempo.
		 */
		
		Integer total2 = nums.stream().reduce(100, soma);
		/*
		 * Como ja tem o valor inicial (100) o resultado do ".reduce()" não será 
		 * opcional de Integer, e sim do tipo primitivo int, sendo assim não é
		 * preciso passar o ".get()"
		 */
		System.out.println(total2);
		
		// Resultado foi um Opcional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println); // ".ifPresent()" == se está presente
	}
}
