package oo.heranca.desafio;

public class Ferrari extends Carro{

//	void acelerar() {
//		velocidadeAtual += 15;
//	}
	
	// Não é obrigatório usar esse "@Override"
	@Override // Isso serve para o Eclipse entender que esse método está sendo sobscrito
	void acelerar() {
		velocidadeAtual += 15;
	}
}
