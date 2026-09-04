package generics;

import java.util.Optional;
import java.util.Set;
import java.util.LinkedHashSet;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
	// LinkedHashSet() ele garante a ordem por inclusão
	
	public void adicionar(C chave, V valor) {
		if (chave == null) return; 
		// Se a "chave" estiver null, sairá do método
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		} // Aqui ele pegará algo que se repete e apaga o primeiro
		
		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if (chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
					.filter(par -> chave.equals(par.getChave()))
					.findFirst();
		
		return parOpcional.isPresent()
				? parOpcional.get().getValor() : null;
	}
	
}
