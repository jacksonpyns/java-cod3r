package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/**
		 *  Poderia fazer também: 
		 *  while(!valor.equalsIgnoreCase("sair"))
		 */
		while (true) {
			System.out.print("Digite algo: (Para sair digite 'Exit')");
			String valor = teclado.nextLine();
			if (valor.equalsIgnoreCase("exit")) {
				break;
			}
		}
		
		System.out.println("Fim!");
		teclado.close();
	}
}
