package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Carro f1 = new Ferrari();
		
		f1.acelerar();
		System.out.println(f1);
		
		Fusca f2 = new Fusca();
		f2.acelerar();
		System.out.println(f2);
		f2.acelerar();
		f2.frear();
		System.out.println(f2);
		f2.acelerar();
		System.out.println(f2);
	}
}
