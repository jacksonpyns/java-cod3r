package generics;

//Representa um tipo genérico que vai ser definido quando ela for usada ou por herança
public class Caixa<TIPO> { 
	
	private TIPO coisa;

	// Basicamente esses dois métodos são os Get e Set
		public void guardar(TIPO coisa) {
			this.coisa = coisa;
		}
		public TIPO abrir() {
			return coisa;
		}
}
