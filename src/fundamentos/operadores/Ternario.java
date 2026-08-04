package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "REPROVADO!";
		String resultadoFinal = media >= 7.0 ? "APROVADO!" : resultadoParcial;
		// Atribuição Condicional
		/**
		 *  Depois do ? significa que a atribuição é VERDADEIRO e
		 *  depois do : significa que a atribuição é FALSA
		 */
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
