package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 2 para fazer o teste:");
		String s2 = entrada.nextLine(); 
		// "next" retira os espaços em braco
		// "nextLine" deixa do mesmo modo que foi digitado
		
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		// Quando for comparar "String" usa-se o ".equals()" não o "=="
		
		entrada.close();
	}
}
