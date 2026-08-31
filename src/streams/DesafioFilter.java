package streams;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Teclado", 120.0, 0.20, 0);
		Produto p2 = new Produto("Mouse", 100.0, 0.20, 0);
		Produto p3 = new Produto("Monitor", 550.0, 0.30, 0);
		Produto p4 = new Produto("Mesa", 430.0, 0.30, 0);
		Produto p5 = new Produto("Cadeira", 670.0, 0.30, 0);
		Produto p6 = new Produto("Processador", 890.0, 0.40, 0);
		Produto p7 = new Produto("HD", 290.0, 0.20, 0);

		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

		// Filter, filter, filter, map
		Predicate<Produto> superPromocao = n -> n.desconto >= 0.30;
		Predicate<Produto> freteGratis = n -> n.valorFrete == 0;
		Predicate<Produto> precoRelevante = n -> n.preco >= 500;
		Function<Produto, String> chamadaPromocional = 
				n -> "Aproveite! " + n.nome + " por R$" + n.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
		
	}
}
