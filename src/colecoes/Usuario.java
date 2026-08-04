package colecoes;

public class Usuario {

	String nome;
	
	Usuario(String nome){
		this.nome = nome;
	}
	
	public String toString() {
		return "Meu nome é " + this.nome + ".";
/**
 *  No momento em que eu tentar imprimir um objeto do tipo Usuario,
 *  será impresso seguindo essa String que foi retornada a partir do toString
 */
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		Usuario outroUsuario = (Usuario) obj;
		return this.nome.equals(outroUsuario.nome); // Esse é meu critério de igualdade
	}
}
