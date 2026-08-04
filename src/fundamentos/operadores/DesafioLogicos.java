package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		System.out.println("Desafio:");
		System.out.println("Se os dois trabalhos derem certos, você comprará uma televisão de 50 polegadas\n"
				+ "no final de semana. Se apenas um dos dois trabalhos derem certo, você comprará uma de \n"
				+ "32 polegadas. Comprando qualquer TV, a familia passeará no shopping para tomar sorvete.\n"
				+ "Se não comprar a TV nova, a familia não sairá e não tomará sorvete, o que deixa mais\n"
				+ "saudável.");
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		System.out.println("Comprou TV 50\"? " + comprouTV50); 
		//para usar "aspas duplas" dentro da string
		
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("Saiu para o Shopping\"? " + sorvete);
		
		// Operador Unário!
		boolean maisSaudavel = !sorvete;
		System.out.println("Mais saudável? " + maisSaudavel);
	}
}
