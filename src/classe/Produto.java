package classe;

public class Produto {

	String nome;
	double preco; // esses são atributos
	static double desconto = 0.25; 
	
	Produto(){ // agora tive que criar um construtor padrão para nao ter que ficar passando um parametro
		
	}
	
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial; 
		preco = precoInicial;
	} //agora o construtor padrao nao existe mais, vou ter que passar um nome, preço e desconto para os outros
	// construtores Produto na classe ProdutoTeste
	
	
	double precoComDesconto() { // ele é um método ou comportamento "()" porque tem atributos dentro dele
		return preco - (preco * desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco - (1 - desconto + descontoDoGerente);
	}
	
	
}
