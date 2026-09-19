package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		/*
		 * O nome obtido através do Scanner vai ser passado como 
		 * paramêtro para a consulta
		 */
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		// O PreparedStatement é mais seguro contra ataques do que o Statement
		
		// String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		stmt.setString(1, nome); // Aqui é o parâmetro do nome
		//stmt.setInt(2, 100); // Aqui é o parâmetro do código (id)
		// Como esse id já foi passado, agora as próximas pessoas adicionadas serão do 100 em diante
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
	}
}
