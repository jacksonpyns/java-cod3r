package oo.abstrato;

public abstract class Mamifero extends Animal{

	@Override
	final 	public String mover() {
		return "Saindo do lugar";
	}
	
	public abstract String mamar();
}
