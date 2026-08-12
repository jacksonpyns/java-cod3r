package oo.heranca.desafio;

public class Ferrari extends Carro{

//	void acelerar() {
//		velocidadeAtual += 15;
//	}
	
	public Ferrari(){
		super(350);
		delta = 15; // O valor "delta" da classe Carro foi alterado aqui
	}
	
	// Não é obrigatório usar esse "@Override"
	@Override // Isso serve para o Eclipse entender que esse método está sendo sobscrito
	public void acelerar() { // Já que o delta foi alterado, aqui já não precisava mais
		velocidadeAtual += 15;
	}
	
	
	
	
}
