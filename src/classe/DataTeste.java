package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data nascimento = new Data();
		nascimento.dia = 6;
		nascimento.mes = 4;
		nascimento.ano = 2006;
		
		System.out.printf("Meu nascimento foi no %d/%d/%d\n"
				, nascimento.dia, nascimento.mes, nascimento.ano);
		
		Data brasilCampeao = new Data(30, 6, 2002);
		// brasilCampeao.dia = 30;
		// brasilCampeao.mes = 6;
		// brasilCampeao.ano = 2002;
		
		//String dataFormatada1 = nascimento.obterDataFormatada();
		
		System.out.printf("A última vez que o Brasil ganhou a Copa do Mundo "
				+ "foi em %d/%d/%d\n"
				, brasilCampeao.dia, brasilCampeao.mes, brasilCampeao.ano);
		 System.out.println(brasilCampeao.obterDataFormatada()); //Com a refatoração
		 nascimento.imprimirDataFormatada();
		 
		 
		 Data teste = new Data();
		 System.out.printf("%d/%d/%d", teste.dia, teste.mes, teste.ano);
	}
}
