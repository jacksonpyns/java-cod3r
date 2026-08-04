package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		// if (bool)...
		// while (bool)...
		// for (;bool;)...
		// já o switch recebe o valor direto
		
		String faixa = "preta";
		
		// Para não ficar se preocupando com letras maiúsculas ou minúsculas
		// usa-se o .toLowerCase()
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodah");
		case "laranja": 
			System.out.println("Sei o Heian Sandan");
		case "vermelha": 
			System.out.println("Sei o Heian Nidan");
		case "amarela": 
			System.out.println("Sei o Heian Shodan");
			break;
	// Se caso nao tiver o default e na "faixa" for uma cor que nao
	//está escrita, ele executará todos os "case"
		default: 
			System.out.println("Ainda não sei nada");
		
		// Caso ele não tenha o "break" ele executará o que está na variável
		// "faixa" e também todos os que estiverem abaixo dele
			
		}
		System.out.println("Fim!");
		
		int idade = 3;
		
		switch (idade) {
		case 3: // se ele tiver 3 ele saberá tudo
			System.out.println("Sabe falar");
		case 2: // se ele tiver 2 ele saberá andar e respirar
			System.out.println("Sabe andar");
		case 1: // se ele tiver 1 ele saberá apenas respirar
			System.out.println("Sabe respirar");
		}
	}
}
