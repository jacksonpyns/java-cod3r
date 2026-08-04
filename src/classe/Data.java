package classe;

public class Data { // Só não posso usar o "this." em métodos "static"

	int dia;
	int mes;
	int ano;
	
	Data() { // CONSTRUTOR PADRÃO
		// dia = 01;
		// mes = 01;
		// ano = 1970;
		this(1, 1, 1970); // Posso chama-lo como um método
		
		// byte, short, int, long -> por padrão será 0
		// float, double -> por padrão será 0.0
		// boolean -> por padrão é false
		// char -> por padrão é '\u0000' primeiro elemento da tabela unicode
		
		// Objetos -> por padrão é null 
		// ex: String s = null; significa que essa variável não aponta para nenhum local de memória
	}
	
	 Data (int dia, int mesInicial, int anoInicial) { 
		// Para que não haja conflitos, porque os nomes são os mesmos:
		 this.dia = dia; // O "this." traz a variável "dia" que está fora da instância
		 mes = mesInicial;
		 ano = anoInicial;
	 }
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // Constante Local, se retirar o "final" ela se torna uma Variável Local
		return String.format(formato, dia, mes, ano);
		// Ou
		// var format = dia + "/" + mes + "/" + ano;
		// return format;
	}
	
	void imprimirDataFormatada() { // void significa ausência de retorno, ele não precisa de return
		System.out.println(this.obterDataFormatada()); // Posso usar o "this." aqui também
	}
}
	
