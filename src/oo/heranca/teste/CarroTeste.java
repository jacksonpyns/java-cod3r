package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste{

	public static void main(String[] args) {
		Carro c1 = new Ferrari();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Ferrari f1 = new Ferrari(400); // Velocidade Máxima alterada
		f1.acelerar();
		System.out.println("A ferrari ta saindo devagar " + f1);
		/**
		 *  Para obter o método "ligarTurbo()" tive que mudar o f1 para a 
		 * classe Ferrari, onde foi herdado do "Esportivo"
		 */
		f1.ligarTurbo();
		f1.ligarAr();
		f1.acelerar();
		f1.frear();
		//f1.frear();
		System.out.println("A Ferrari ligou o turbo e acelerou! " + f1);
		f1.acelerar();
		System.out.println("A Ferrari acelerou " + f1);
		
		System.out.println(f1.velocidadeDoAr());
		
		Fusca f2 = new Fusca();
		f2.acelerar();
		System.out.println("O Fusca acelerou!!! " + f2);
		
		
	}
}
