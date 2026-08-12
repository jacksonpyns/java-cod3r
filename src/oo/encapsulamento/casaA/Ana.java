package oo.encapsulamento.casaA;

public class Ana {

	// Para nao gerar nenhum problema para o atributo Privado que não está sendo usado
	@SuppressWarnings("unused") 
	private String segredo = "...";
	String facoDentroDeCasa = "..."; // default ou pacote
	protected String formaDeFalar = "...";
	public String todosSabem = "...";
	
}
