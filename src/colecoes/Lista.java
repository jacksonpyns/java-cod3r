package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<Usuario>(); 
		// Não é necessário colocar o "Usuario" no final, ex: "new ArrayList<>();"
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Gustavo"));
		lista.add(new Usuario("Kaike"));
		lista.add(new Usuario("Kaua"));
		lista.add(new Usuario("Samuel"));
		
		// Para obter um determinado elemento a partir do id:
		System.out.println(lista.get(3));
		
	// Lembrando que se remover o HashCode e o Equals não funcionaria o .remove e .contains
		
		// Para remover:
		lista.remove(1); // Acessar pelo índice
		lista.remove(new Usuario("Samuel"));
		/**  Remover a partir de um Objeto:
		 * Tem que ser escrito exatamente igual,
		 * já que ele está usando o Equals e o HashCode de tal forma
		 * que ele vai usar apenas o nome para idenficar se é igual ou não.
		 */
		
		// Para verificar se está contido:
		System.out.println("Tem? " + lista.contains(new Usuario("Kaike"))); 
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	}
}
