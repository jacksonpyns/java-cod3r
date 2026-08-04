package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked"}) // Isso é uma anotação
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Caracter
		
		System.out.println("Tamanho é " + conjunto.size()); 
		// .size() conta quantos objetos há em "conjunto"
		
		conjunto.add("teste"); 
		/**
		 *  Como esse é com "t" minusculo, o conjunto recebe outro objt diferente.
		 *  Mas se fosse com "t" maiúsculo, o conjunto só ignoraria,
		 * porque ele não aceita repetição.
		 */
		
		System.out.println("Tamanho é " + conjunto.size());
		
		// Para remover um objt dentro do conjunto usa-se o .remove():
		System.out.println(conjunto.remove("teste")); 
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());

		// Para "verificar" se há o 'x' no conjunto:
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums); // Mostra somente o valor que tem em comum entre os dois HashSets
		System.out.println(conjunto);
		
		conjunto.clear(); // Para limpar
		System.out.println(conjunto);
	}
}
