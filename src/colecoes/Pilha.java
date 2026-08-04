package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha { // LIFO -> O último a entrar é o primeiro a sair 

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe"); // Se ele adicionar ou não, retornará true ou false
		livros.push("Don Quixote"); 
		// Se ele adicionar ou não, não retornará nada, mas retornará erro
		// se caso o "livros" tiver restrição de tamanho e não couber mais nada
		livros.push("O Hobbit");
		
		// Aqui os princípios serão os mesmos
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop()); 
		// .pop() funciona que nem o .remove(), dará erro se não ouver mais o que apagar
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		// livros.size(); // para saber o tamanho
		// livros.clear(); // para limpar
		// livros.contains(); // para encontrar um elemento, retornando um valor booleano
		// livros.isEmpty(); // se está vazia ou não
		
	}
}
