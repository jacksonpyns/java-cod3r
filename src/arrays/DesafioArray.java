package arrays;

import java.util.Scanner;

public class DesafioArray {

	// Calcular a média das notas do aluno
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas você quer informar? ");
		int aluno = entrada.nextInt();
		
		double []notas = new double [aluno];
		
		double soma = 0; // Para somar todas as notas e fazer a média no final
		
		for (int quant = 0; quant <= aluno-1; quant ++) {
			System.out.print("Informe a nota " + (quant+1) + ": ");
			double n = entrada.nextDouble();
			notas[quant] = n;
			soma += n;
		}
		
		for (double nota: notas) {
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		System.out.println("A média das notas é: " + soma/aluno);
		
		entrada.close();
	}
}
