package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro mostro = new Monstro(10, 10);
//		mostro.x = 10;
//		mostro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
//		heroi.x = 10; // Foi criado um construtor para o Heroi passando os valores de "x" e "y"
//		heroi.y = 11;

		System.out.println("O Monstro tem => " + mostro.vida);
		System.out.println("O Heroi tem => " + heroi.vida);
		
		mostro.atacar(heroi);
		heroi.atacar(mostro);
		
		System.out.println("O Monstro tem => " + mostro.vida);
		System.out.println("O Heroi tem => " + heroi.vida);
	}
}
