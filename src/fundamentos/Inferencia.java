package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		/*
		 *  Uma variável não pode trocar seu tipo, por exemplo
		 *  "a" não pode ser do tipo string porque já é do tipo double.
		 *  
		 */
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // variável usada!
		
		var e = 123.45;
		System.out.println(e);
	}
}
