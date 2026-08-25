package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> umaLista = 
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		/**
		 *  Nesse caso como não recebo nenhum parâmetro de entrada
		 * é obrigatório usar os "()".
		 */
				
		System.out.println(umaLista.get()); // Para chamar o Supplier tem que usar o método ".get()"
	}
}
