package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO { //Data Access Object (Objeto de Acesso a Dados)
	// Usado para separar a lógica de negócio da lógica de acesso a banco de dados


	private Connection conexao;
	
	// O "Object..." são argumento variados, é uma junção de vários objetos que representam atributos
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stmt = getConexao()
					.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
				adicionarAtributos(stmt, atributos);
				
			if(stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				
				// se o resultado existe, ou seja, se está presente
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			
			// Se caso ele não entrar em nenhum dos acima ele retornará a chave -1
			return -1;
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void close() {
		try {
			getConexao().close();
		} catch (SQLException e) {
			
		} finally {
			conexao = null;
		}
	}
	
	private void adicionarAtributos(PreparedStatement stmt,
			Object[] atributos) throws SQLException {
		
		int indice = 1;
		for (Object atributo: atributos) {
			if (atributo instanceof String) {
				stmt.setString(indice, (String) atributo);
			} else if (atributo instanceof Integer) {
				stmt.setInt( indice,(Integer) atributo);
			}
			
			indice++;
		}
	}
	
	private Connection getConexao() {
		// O "conexao.isClosed()" é um método que retorna exceção por isso o try catch
		try {
			if (conexao != null && !conexao.isClosed()) {
				return conexao;
				// se ele nao cair aqui sgnifica que a conexão está fechada ou não existe
			}
		} catch (SQLException e) {
			
		} 
		// Se não estiver indo lá, crio uma nova aqui
		conexao = FabricaConexao.getConexao();
		return conexao;
	}
}
