package classe;

public class Usuario {

	String nome;
	String email;
	
	// Critério para determinar se um usuário é igual a outro
	public boolean equals(Object objeto) { 
		
		if(objeto instanceof Usuario) { //Se o "objeto" que foi passado é uma instancia de "Usuario"
			Usuario outro = (Usuario) objeto;
			/**
			 *  Funciona no mesmo conceito de Cash,
			 * se você tem uma variável double e quer converter para int
			 * você diz o termo int entre parênteses que é o Cash
			 * e converte de double para um int.\
			 * 
			 *  Um "Object" é o objeto mais genérico no java, 
			 * todos os outros são descendentes dela. 
			 * 
			 *  Aqui fiz um Cash do "objeto", fiz uma conversão para "Usuario"
			 * 
			 */
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
}
