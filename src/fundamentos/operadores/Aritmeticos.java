package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 23.45;
		var y = 67.4;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // Para converter um número "int" para "double"
		System.out.println(a / (float) b); // Para converter um número "int" para "float"

		// Operador Módulo
		System.out.println(a % b);
		System.out.println(8 % 3); 
		/**
		 * Ele pega o que sobrou da conta
		 * por exemplo, 8/3 é 6 e sobra 2
		 * então ele mostrará 2
		 */
		
		System.out.println(x + y - a * b); 
		// A multiplicação e divisão tem precedencia na conta, como em uma conta normal
	}
}
