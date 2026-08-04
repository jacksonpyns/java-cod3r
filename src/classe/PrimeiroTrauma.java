package classe;

public class PrimeiroTrauma {

	int a = 3; // Esse atributo pertence a instância
	// Então para acessar esse atributo, tenho que criar uma instância
	
	static int b = 4; // Um membro "static" consegue acessar outro membro "static"
	
	public static void main(String[] args) { // Um método que pertence a classe
		
		PrimeiroTrauma p = new PrimeiroTrauma(); // Criei uma instância p
		System.out.println(p.a); // Para poder chamar, terei que colocar p "." a
		
		System.out.println(b); // Ele sendo "static" pertence a classe, então consigo acessar
	}
}
