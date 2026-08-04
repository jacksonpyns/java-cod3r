package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		// 4 é a quantidade de notas atribuidas a esse aluno
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		// Para fazer imprimir as notas tem que importar a biblioteca Arrays
		
		System.out.println("Primeira nota do aluno A: " + notasAlunoA[0]);
		System.out.println("Última nota do aluno A: " + notasAlunoA[notasAlunoA.length-1]);
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) { 
			totalAlunoA += notasAlunoA[i];
		}
		// O "notasAlunoA.length" é para ele pegar a quantidade que tem dentro do notasAlunoA
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		// Outro método de passar as notas para o Aluno
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
