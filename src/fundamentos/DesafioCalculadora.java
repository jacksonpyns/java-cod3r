package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		// Ler pelo terminal num1
		// Ler num2
		// vai pedir pro usuário digitar a operação que ele quer: +, -, *, /, %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("\nInforme o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("\nInforme a operação: ");
		String op = entrada.next();
		
		// Lógica para resolver
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;


		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		entrada.close();
	}
}
