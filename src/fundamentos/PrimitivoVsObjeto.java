package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		// tudo no java é objeto, menos os tipos primitivos
		
		//Wrappers são a versão objeto dos tipos primitivos!
		int a = 345;
		System.out.println(a);
	}
}
