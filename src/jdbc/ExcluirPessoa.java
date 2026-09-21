package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o Código de quem irá deletar: ");
		int codigo = entrada.nextInt();

		Connection conexao = FabricaConexao.getConexao();
		//String sql = "DELETE FROM pessoas WHERE codigo = ?"; // Aqui ele deletará apenas 1
		String sql = "DELETE FROM pessoas WHERE codigo > ?";
		 // Aqui será deletado todos os que forem maiores que o código passado no console

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);

		int contador = stmt.executeUpdate();
		
		/*
		 * O ".executeUpdate()" ele retorna no tipo int, retorna a quantidade de linhas
		 * que foram afetadas a partir da sua execução, ou seja, se ele retornar zero é
		 * porque nada foi alterado através da consulta.
		 */
		//if (stmt.executeUpdate() > 0) {
		if (contador > 0) {
			System.out.println("Pessoa excluida com sucesso!");
			System.out.println("Linhas afetadas: " + contador);
		} else {
			System.out.println("Nada feito!");
		}

		stmt.close();
		entrada.close();
		conexao.close();
	}
}
