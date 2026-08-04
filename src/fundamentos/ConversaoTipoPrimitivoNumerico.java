package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1.1234567888888; // Conversão Implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888888; // Conversão ExplÍcita (CAST)
		// aqui foi feito um CAST para converter para o valor float
		// poderia também só ter colocado o f depois do número, já converteria
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Conversão Explícita (CAST)
		// ele só irá armazenar se o "c" for convertido para o tipo byte
		// até onde o byte consegue armazenar também
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; // Conversão Explícita (CAST)
		System.out.println(f);
	}
}
