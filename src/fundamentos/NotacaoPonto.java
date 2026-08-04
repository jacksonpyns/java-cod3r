package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		// para o "s" ficar maiusculo ele precisa receber (=) o s.toUpperCase() 
		
		s = s.replace("X", "Senhora");
		// replace troca o valor selecionado pelo que colocar depois da virgula
		
		s = s.concat("!!!");

		System.out.println(s);
		
		System.out.println("Leo!".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Gui").toUpperCase()
				.concat("!!!");
		// posso tanto colocar tudo em uma linha só, como também pular linha
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
	}
}
