package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana { // Como Ana está em outro pacote, tem que importar

	void testeAcesso() {
		
		// Ana mae = new Ana(); //Instância de Ana
		
		// System.out.println(mae.segredo); // Só na classe Ana da pra ver
		// System.out.println(mae.facoDentroDeCasa); // Só é visivel para quem está no mesmo pacote
		System.out.println(formaDeFalar); // mae.formaDeFalar
		System.out.println(todosSabem); // mae.todosSabem
		/**
		 *  Nesses dois não precisa usar uma instância da Ana porque
		 * esses atributos foram recebidos por HERANÇA
		 */
	}
}
