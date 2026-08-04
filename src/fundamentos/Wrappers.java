package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		//Scanner teclado = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000; 
		
		//Integer.parseInt(teclado.next()); //eu converteria o valor para int
		Integer i = 10000; // int
		//se o usuário digitar um valor int será convertido para o "i"
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10f;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		/**
		 * Se primeiro transformar o valor booleano em String e depois 
		 * acrescentar o .toUpperCase() aí sim funciona
		 */
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
		//teclado.close();
	}
}
