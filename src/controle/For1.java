package controle;

public class For1 {

	public static void main(String[] args) {
	
		for (int cont = 0; cont <= 20; cont += 2) {
			System.out.printf("i = %d\n", cont);
		}
		
		// Laço no estilo while
		int x = 2;
		for(; x < 10;) {
			System.out.println("X = " + x);
			x++;
		}
		
		// Laço no estilo infinito!!!
		for(;;) {
			System.out.println("Repetir até morrer!");
		}
	}
}
