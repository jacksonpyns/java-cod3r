package oo.composicao;

public class Motor {		
	
	final Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() { // só para lembrar, isso é um membro
		if(!ligado) { // Se não estiver ligado
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
