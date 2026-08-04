package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int a = 4 * 3 - 10;
		int b = (int) Math.pow(a, 3); // para elevar "a" ao cubo
	// Tem que transformar em "int" porque a função "Math.pow" traz para "double"
		double c = Math.pow(a,  3);
		
		System.out.println(b);
		System.out.println(c); // tipo doble
		
		
		// Começo do Desafio
		var x = (6 * (3 + 2));
		var x2 = (int) Math.pow(x, 2);
		var xResult = x2 / (3 * 2);
		
		var y = ((1 - 5) * (2 - 7)) / 2;
		var yResult = (int) Math.pow(y, 2);
		
		System.out.println("O resultado da primeira é: " + xResult);
		System.out.println("O resultado da segunda é: " + yResult);
		
		var xy = xResult - yResult;
		var xy3 = (int) Math.pow(xy, 3);
		var ten = (int) Math.pow(10, 3);
		var xyResult = xy3 / ten;
		
		System.out.println("O resultado é: " + xyResult);
		
	}
}
