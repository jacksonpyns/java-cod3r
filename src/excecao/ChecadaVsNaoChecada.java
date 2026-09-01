package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			geraErro2();
		} catch (Throwable e) { // Tudo que é "Throwable" pode ser tratado dentro do catch
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Exceção NÃO checada ou NÃO verificada
	static void geraErro1() throws RuntimeException{ // Esse aqui não precisa ser tratado
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	} // "throw" significa "lançar", então fica: lance um novo erro Runtime Exception
	
	// Exceção checada ou verificada
	static void geraErro2() throws Exception{
			throw new Exception("Ocorreu um erro bem legal #02!");
	}
	/*
	 *  Como essa é uma exceção checada, ela dará erro de compilação,
	 * tem que usar obrigatóriamente na assinatura do método que está
	 * sendo lançado esse tipo de exceção.
	 * 
	 *  Então para ela poder iniciar tem que usar o "throws" + "Exception"
	 * tem que deixar claro que está na assinatura.
	 */
}
