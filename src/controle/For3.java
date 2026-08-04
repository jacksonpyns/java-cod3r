package controle;

public class For3 {

	public static void main(String[] args) {
		
		
		int i = 0;
		for (; i < 10; i++) {
			System.out.println(i);
		}
		/**
		 * A variável "i" só poderá ser vista caso ela
		 * seja criada fora do laço
		 * 
		 * Depende de onde ela é criada e para onde ela
		 * está disponível
		 */
		System.out.println("Saiu do for...");
		System.out.println(i);
		
		
		// fazendo contar até 100
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				System.out.printf("[%d %d]\n", x, y);
			}
		}
		
		
		
		
	}
}
