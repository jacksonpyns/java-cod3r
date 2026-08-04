package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.println(" dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n",
				1, 2, 3, 4, 5, 6);
		//para quebrar a linha pode-se usar também o "%n"
		System.out.printf("Salário: R%.2f%n", 1234.4678);
		System.out.printf("Nome: %s%n", "João");
		// System.out por padrão a saída é a tela: out significa saída
		
		/**
		 * System.in é a entrada do sistema, ou seja, por padrão é ela
		 * que usa para perguntar alguma coisa para o usuário
		 */
		// A biblioteca java.util diriamos que é a segunda mais usada
		// depois da java.lang
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.\n", nome, sobrenome, idade);
		//System.out.println("Nome = " + nome + " " + sobrenome);
		
		// e o Scanner entrada tem que ser feichado para não ficar ocupando espaço
		entrada.close();
	}
}
