package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		/**
		 * O Math.random() gera um número aleatório entre 0 e 1,
		 * por exemplo: 0.1, 0.11, 0.45, 0.98
		 */
		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		// Aí ele cria um número aleatório, e se for maior que 0.5 ele mostra o "Opa"
		if (s2 != null) {
			System.out.println(s2.concat("???"));
		}
		
	}
}
