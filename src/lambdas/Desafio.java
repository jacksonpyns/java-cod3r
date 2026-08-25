package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p2 = new Produto("iPad", 3235.89, 0.13);
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)/ < 3000(50)
		 * 4. Arredondar: deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		// Resposta sem os Lambdas
		double precoComDesconto2 = p2.preco - (p2.preco * p2.desconto);
		System.out.printf("O preço só com desconto é R$%.2f", precoComDesconto2);
			
		double imposto = 0.085;
		double precoComImposto2;
		if (precoComDesconto2 >= 2500) {
			precoComImposto2 = precoComDesconto2 + (precoComDesconto2 * imposto);
		} else {
			precoComImposto2 = precoComDesconto2;
		}
		System.out.printf("\nO preço com desconto e com imposto é R$%.2f", precoComImposto2);
			
		double precoFinal2;
		if (precoComImposto2 >= 3000) {
			precoFinal2 = precoComImposto2 + 100;
		} else {
			precoFinal2 = precoComImposto2 + 50;
		}
		System.out.printf("\nO preço com desconto, imposto e frete é R$%.2f", precoFinal2);
		
		System.out.printf("\n\nO preço Final sem usar Lambda é R$%.2f", precoFinal2);
		
		
		
		System.out.println("\n");
		
		Function<Produto, Double> precoFinal =
				produto -> produto.preco - (produto.preco * 0.13);
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco + (preco * 0.085) : preco;
		UnaryOperator<Double> frete =
				valor -> valor >= 3000 ? valor + 100 : valor + 50;
		UnaryOperator<Double> arredondar = // Passar a String para o Whapper Double
				//preco -> Double.parseDouble(String.format("%.2f", preco));
				preco -> Math.round(preco * 100.0) / 100.0;
		Function<Double, String> formatar =
				preco -> ("R$" + preco).replace(".", ",");
		
				
		Produto p = new Produto("iPad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preço final usando as Lambdas é " + preco);
	}
}
