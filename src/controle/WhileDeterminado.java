package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		int cont = 1;
		
		while (cont <= 10) {
			System.out.printf("i = %d", cont);
			cont++; // de 1 em 1
			//cont += 2; // de 2 em 2
		}
	}
}
