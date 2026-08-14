package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Ferrari(){
		this(315); // Velocidade Máxima
		//delta = 15; // O valor "delta" da classe Carro foi alterado aqui
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
		//delta = 15; // Aqui é antes de tornar o "delta" private
	}
	
	// Não é obrigatório usar esse "@Override"
//	@Override // Isso serve para o Eclipse entender que esse método está sendo sobscrito
//	public void acelerar() { // Já que o delta foi alterado, aqui já não precisava mais
//		velocidadeAtual += 15;
//	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr){
			return 30;
		} else if (!ligarTurbo && ligarAr){
			return 20;
		} else {
			return 15;
		}
	}
	
	
}
