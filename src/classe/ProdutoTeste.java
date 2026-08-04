package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		// p1.nome = "Notebook";
		// p1.preco = 4356.89;
		// p1.desconto = 0.25; // 25% de desconto
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.5; // Desconto
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto(); //refatorado, que significa que foi atualizado
		double precoFinal2 = p2.preco - p2.preco * Produto.desconto;
		System.out.printf("O produto 2 foi R$%.2f\n", precoFinal1);
		System.out.printf("O produto 2 foi R$%.2f\n", precoFinal2);
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("O preço final dos dois produtos ficam R$%.2f", mediaCarrinho);
	}
}
