package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.nome = "Jackson";
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000.00), 1);
		
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);;
		
		System.out.println(cliente.obterValorTotal());
	}
}
