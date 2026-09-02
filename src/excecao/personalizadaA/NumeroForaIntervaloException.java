package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException{
	/*
	 *  Uma classe que herda de Runtime, ou seja
	 * uma Exceção NÃO checada.
	 */
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.",
				nomeDoAtributo);
	}
}
