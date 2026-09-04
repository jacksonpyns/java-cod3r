package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Porteiro porteiro = new Porteiro();
		Namorada namorada = new Namorada();
		
		/*
		 *  Para que seja notificado e algo aconteça tem que registrar
		 * a intenção da namorada de ser alertada:
		 */
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa via lambda!");
			System.out.println("Ocorreu em " + e.getMomento());});
		porteiro.monitorar();
	}
}
