package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415; // com "static" agora essa variavel pertence a classe
	// "final" não permitirá mudar o valor dessa variável
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2); // raio ao quadrado
	}
	
	static double area(double raio) { // método da classe (statico)
		return PI * Math.pow(raio, 2); // esse raio é dessa instância, desse método
	} // Se tem "return" é método! Só para lembrar kk
}
