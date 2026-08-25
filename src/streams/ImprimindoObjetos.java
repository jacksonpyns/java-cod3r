package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		// Formas diferentes de exibir a lista:
		// for tradicional:
		System.out.println("Usando o for normal...");
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		// foreach
		System.out.println("\nUsando o Foreach...");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		// iterator
		// Iteração significa repetição, passar por todos os elementos de uma lista
		System.out.println("\nUsando Iterator...");
		Iterator<String> it = aprovados.iterator(); 
		// Ele se pergunta se tem próximo, se tiver coninua, se não ele para e sai do while
		while(it.hasNext()) { 
			System.out.println(it.next());
			// Forma que tenho para percorrer os itens é o "it"
		}
		
		// Também é um conjunto de objetos, mas a interação ocorre de forma interna
		System.out.println("\nUsando a lista Stream para ler...");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);
	}
}
