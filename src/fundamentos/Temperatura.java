package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		
		final int valorSubtrair = 32;
		final double valorDivisor = 5.0/9.0;
		
		int fahrenheit = 86;
		double celsius = ((fahrenheit - valorSubtrair) * valorDivisor);
		System.out.println("O resultado é " + celsius + "°C.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - valorSubtrair) * valorDivisor;
		System.out.println("O resultado é " + celsius + "°C.");
	}
}
