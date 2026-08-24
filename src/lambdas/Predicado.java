package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		// Se o preço com desconto for maior ou igual a 750 irá dar "true"
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		// O Predicate sempre irá retornar um valor de verdadeiro ou falso
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15); // 0.15 = 15% de desconto
		System.out.println(isCaro.test(produto));
	}
}
