package generics;

public class CaixaObjeto {

	private Object coisa;
	
	// Basicamente esses dois métodos são os Get e Set
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	public Object abrir() {
		return coisa;
	}
}
