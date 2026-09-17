package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		// JDBC = Conectividade de Java com Banco de Dados
		final String url = "jdbc:mysql://localhost";
		final String usuario = "root";
		final String senha = "reservado";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		// Uma execução de um comando no banco de Dados
		Statement stmt = conexao.createStatement();
		
		// Através do STATEMENT vou criar um novo Banco de Dados
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		/*
		 *  O SQL não é uma linguagem Case Sensitive, então não importa
		 * se a letra é maiuscula ou minuscula.
		 * 
		 */
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}
}
