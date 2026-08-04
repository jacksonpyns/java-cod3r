package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		// Para adicionar é ".put" e ele tanto adiciona se não existir quanto substitui se ja existir
		usuarios.put(1, "Roberto"); 
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		// Continua com o mesmo comportamento
		System.out.println(usuarios.size()); // Conta o tamanho
		System.out.println(usuarios.isEmpty()); // Verifica se está vazio ou nao(retornando em boolean)
		
		System.out.println(usuarios.keySet());
		// Pega as "chaves" do conjunto
		System.out.println(usuarios.values());
		// Pega os "valores" do conjunto
		System.out.println(usuarios.entrySet());
		// Pega as "chaves" e os "valores" ao mesmo tempo
		
		// Contains
		System.out.println(usuarios.containsKey(20));
		// Para verificar SE TEM a "chave" desejada (true ou false)
		System.out.println(usuarios.containsValue("Rebeca"));
		// Para verificar SE TEM o "valor" desejado (true ou false)
		
		System.out.println(usuarios.get(20)); // Pegar o "valor" pela "chave"
		System.out.println(usuarios.remove(1)); // Pode remover a partir da "chave" ou "valor"
		
		// Para percorrer os elemento de um MAP (foreach)
		for(int chave: usuarios.keySet()){ // Como é um Integer posso converter para o tipo int
			System.out.println(chave);
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		// Para percorrer os dois elementos dentro do MAP
		// Entry de java.util.Map.Entry
		// Colocar os mesmos métodos usados no Map(Integer, String)
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
		
	}
}
