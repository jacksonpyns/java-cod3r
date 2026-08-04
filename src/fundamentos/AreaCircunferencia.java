package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		
		// "final" significa que o valor não poderá ser mudado dentro do algoritmo
		// se tornando uma constante
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		// Se eu quiser mudar o valor de uma variavel não devo colocar seu tipo
		raio = 10;
		area = PI * raio * raio;
		
		// A junção "+" se chama concatenar:
		System.out.println("Área = " + area + "m2.");
	}
}
