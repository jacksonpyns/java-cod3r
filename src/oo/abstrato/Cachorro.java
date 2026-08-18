package oo.abstrato;

public class Cachorro extends Mamifero{

	// O método "mover()" na classe pai foi reescrito com o "final"j
//	@Override
//	public String mover() {
//		return "Usando as patas";
//	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
}
