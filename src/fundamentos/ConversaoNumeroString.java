package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
	
		Integer num1 = 10000; // tipo Wrapper
		System.out.println(num1.toString().length());

		int num2 = 100000; // tipo Primitivo
		System.out.println(Integer.toString(num2).length());
		/**
		 *  Aqui eu mudo o tipo "int" para o "integer" 
		 *  para depois poder mudar para "String" 
		 *  para depois saber quantos caracteres tem
		 */
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());

		/**
		 *  Pode-se converter também contatenando com uma
		 *  String vazia. 
		 */
	}
}