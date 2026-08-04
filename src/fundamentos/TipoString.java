package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		// .charAt() é para saber qual é o caracter dentro do espaço ()
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println("A frase começa com BOA? " + s.startsWith("BOA"));
		System.out.println("A frase começa com Boa? " + s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		// .startsWith() é para saber com quais caracteres começa a variável
		
		System.out.println("termina com TARDE? " + s.endsWith("TARDE"));
		// .endsWith() é para saber com quais caracteres termina a variável
		
		System.out.println("Quantos caracteres tem? " + s.length());
		// .length() é para saber quantos caracteres tem na variável selecionada
		
		System.out.println(s.equals("boa tarde"));
		// .equals() é para conferir se está a mesma coisa na var
		
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		// .equalsIgnoreCase() nesse caso ele não vai olhar se as letras são "maiúsculas" ou "minúsculas"
		
		var nome = "Pedro";
		var sobrenome = "Silva";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome 
				+ "\nIdade: " + idade + "\nSalario: " + salario + "\n");
		
		System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		// As variáveis substituem os "%s"
		// O "%d" substitue os valores que são int
		/**
		 *  O "%f" substitue os valores do tipo float ou double
		 *  E da para editar quantas casas decimais com .2f para duas casas decimais por exemplo
		 */
		
		String frase = String.format("\nNome: %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		// .contains() é para verificar se há a palavra na frase selecionada
		
		System.out.println("Frase qualquer".indexOf("qual"));
		// .indexOf() é para saber em qual númeração começa a palavra ou a letra verificada
		
		System.out.println("Frase qualquer".substring(6));
		// .substring() é para começar da numeração selecionada na substring da variável
		
		System.out.println("Frase qualquer".substring(6, 8));
		// e se colocar uma numeração para o caracter final, ele pegara o "primeiro" até o "penúltimo"
	}
}
