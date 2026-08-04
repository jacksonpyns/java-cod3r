package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila { // FIFO -> O primeiro a entrar é o primeiro a sair

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>(); // LinkedList aceita todos os métodos de fila
		
		// Métodos de adicionar a fila:
		// Offer e Add -> adicionam elementos a fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana");
		/**
		 * O modo ".add" pode gerar erro caso você queira adicionar algo 
		 * em uma fila que tem tamanho pré definido.
		 */
		fila.offer("Bia");
		/**
		 * Caso ele não consiga adicionar a uma fila que tem restrição de tamanho(
		 * um tamanho pré definido) ele mostrará falso.
		 */
		
		fila.offer("Carlos");
		fila.add("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");
		
		// Pegar um elemento da fila: 2 Métodos
		// Peek e Element -> obter o próximo elemento da fila (sem remover)
		System.out.println(fila.peek());
		System.out.println(fila.element());
		/**
		 * O que diferencia cada um é quando a fila estiver vazia,
		 * pois o "peek" mostrará "null"
		 * e o "element" mostrará erro (porque não tem o elemento dentro da lista).
		 */
		
		// fila.size() para saber a quantidade de itens na fila
		// fila.clear() para limpar a fila
		// fila.isEmpty() para saber se a fila está ou não vazia
		
		System.out.println(fila.poll());
		// Aqui ele retorna o primeiro elemento da fila ja o removendo
		System.out.println(fila.poll());
		// O que significa que aqui ele já mostrará o segundo elemento da fila
		// e se continuar, ele mostrará o seguinte e assim sucessivamente
		// e quando a lista estiver vazia mostrará null
		
		System.out.println(fila.remove());
		// Removerá o seguinte item da fila, se não tiver mais o que remover dará erro
	}
}
