package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double
		// Ele irá envolver um tipo Primitivo em Wrappers
		
// Tem que colocar de forma EXPLICITA no cache pq nem todo Object é Double
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
	
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
	}
}
