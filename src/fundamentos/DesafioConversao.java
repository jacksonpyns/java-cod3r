package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		System.out.println(
				"Crie um Scanner, defina 3 Strings usando o nextLine que seria os últimos 3 salários\n"
				+ "de um funcionário. Calcule a média desses três, e deve funcionar tanto com\n"
				+ "ponto como com virgula.");
		// Para substituir qualquer virgula por ponto ou vice versa usa-se o ".replace"
		
		Scanner teclado = new Scanner(System.in);
		// teclado.nextLine() pega a linha inteira, enquanto o teclado.next() pega somente a palavra
		
		System.out.print("Qual foi o primeiro salário? R$");
		String salario1 = teclado.nextLine().replace(",", ".");

		System.out.print("Qual foi o segundo salário? R$");
		String salario2 = teclado.nextLine().replace(",", ".");
		
		System.out.print("Qual foi o terceiro salário? R$");
		String salario3 = teclado.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		System.out.printf("Os salários foram %.2f %.2f %.2f\n", s1, s2, s3);

		double media = (s1 + s2 + s3) / 3;
		System.out.printf("\nE a Média entre eles é %.2f" , media);
		
		teclado.close();
	}
}
