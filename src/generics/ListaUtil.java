package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size()-1); 
		// O "?" significa qualquer coisa
	} // Para pegar o ultimo elemento da lista
	
	
	// Agora usando o Generics
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size()-1); 
	}
	
	// Os que estão dentro do <> são os parâmetros genéricos
//	public static <A, B, C> C teste(A paramA, B paramB) {
//		C teste = null;
//		return teste;
//	}
	
}
