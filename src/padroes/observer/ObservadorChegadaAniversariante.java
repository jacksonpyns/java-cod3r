package padroes.observer;

@FunctionalInterface // Porque só tem um único método
public interface ObservadorChegadaAniversariante {

	public void chegou(EventoChegadaAniversariante evento);
	
	
}
