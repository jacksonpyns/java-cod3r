package lambdas;

public class Produto extends Object{ 
	// A classe mãe de todas as de todas as outras classes em Java é o "Object"
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " Tem preço: R$" + precoFinal;
	}
}
