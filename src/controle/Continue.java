package controle;

public class Continue {

	public static void main(String[] args) {
		
		// para mostrar os valores PARES
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) { //valor ÍMPARES
				continue; // ele interrompe apenas quando chega no número ímpar
			}
			
			System.out.println(i);
		}
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; // ele pulará o 5
			}
			
			System.out.println(i);
		}
	}
}
