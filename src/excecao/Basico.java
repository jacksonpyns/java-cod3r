package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		// Para resolver esse problema, tem que abrir um bloco de try
		try {
			imprimirNomeDoAluno(a1); 
		} catch(Exception exception) {
			System.out.println("Ocorreu um erro no momento "
					+ "de imprimir o nome do usuário");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("FIM :)");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
