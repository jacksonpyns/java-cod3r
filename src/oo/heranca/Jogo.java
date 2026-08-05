package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro mostro = new Monstro();
		mostro.x = 10;
		mostro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println("O Monstro tem => " + mostro.vida);
		System.out.println("O Heroi tem => " + heroi.vida);
		
		mostro.atacar(heroi);
		heroi.atacar(mostro);
		
		System.out.println("O Monstro tem => " + mostro.vida);
		System.out.println("O Heroi tem => " + heroi.vida);
	}
}
