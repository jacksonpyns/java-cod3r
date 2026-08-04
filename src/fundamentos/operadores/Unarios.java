package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		/**
		 *  Aqui ele primeiro faz a conta com o "a" e depois compara o "b",
		 *  aí por último ele desconta do "b" o menos 1, então ele faz a 
		 *  comparação ++a (2) e b (2), e depois o "b" fica (2-1).
		 */
		System.out.println(a == b);

		System.out.println(a);
		System.out.println(b);
	}
}
