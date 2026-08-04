package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem na turma? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();
		
		double [][]notasDaTurma = new double [qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			for (int notas = 0; notas < notasDaTurma[aluno].length; notas++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", notas+1, aluno+1);
				notasDaTurma[aluno][notas] = entrada.nextDouble();
				total += notasDaTurma[aluno][notas];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A média da turma é : " + media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
	}
}
