package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10; // Mudei o valor de pi
		
		//AreaCirc.PI = 3.1415; // Para poder mudar uma variavel "static" de outra classe
		
		System.out.println(a1.area());
		
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI); // Da própria API do java
	}
}
